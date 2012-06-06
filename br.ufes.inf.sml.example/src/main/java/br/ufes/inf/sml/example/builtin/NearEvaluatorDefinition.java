package br.ufes.inf.sml.example.builtin;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.drools.RuntimeDroolsException;
import org.drools.base.BaseEvaluator;
import org.drools.base.ValueType;
import org.drools.base.evaluators.EvaluatorDefinition;
import org.drools.base.evaluators.EvaluatorParametersParser;
import org.drools.base.evaluators.Operator;
import org.drools.common.InternalWorkingMemory;
import org.drools.rule.VariableRestriction.ObjectVariableContextEntry;
import org.drools.rule.VariableRestriction.VariableContextEntry;
import org.drools.spi.Evaluator;
import org.drools.spi.FieldValue;
import org.drools.spi.InternalReadAccessor;

@SuppressWarnings("restriction")
public class NearEvaluatorDefinition implements EvaluatorDefinition {

	public static final Operator NEAR       	= Operator.addOperatorToRegistry( "near", false );
	public static final Operator NOT_NEAR 		= Operator.addOperatorToRegistry( "near", true );

    private static final String[] SUPPORTED_IDS = { NEAR.getOperatorString() };
    
    private volatile DistanceParser parser        = new DistanceParser();
    
    private Evaluator[] evaluators;
    
    
    public void readExternal(ObjectInput in) throws IOException,
    ClassNotFoundException {
    	evaluators = (Evaluator[]) in.readObject();
    }

    public void writeExternal(ObjectOutput out) throws IOException {
    	out.writeObject( evaluators );
    }
    
    public Evaluator getEvaluator(ValueType type,
    		Operator operator) {
    	return this.getEvaluator(type, operator.getOperatorString(), operator.isNegated(), null);
    }
   
    public Evaluator getEvaluator(ValueType type,
    		Operator operator,
    		String parameterText) {
    	return this.getEvaluator(type, operator.getOperatorString(), operator.isNegated(), parameterText);
    }
    public Evaluator getEvaluator(final ValueType type,
    		final String operatorId,
    		final boolean isNegated,
    		final String parameterText) {
    	return this.getEvaluator( type,
    			operatorId,
    			isNegated,
    			parameterText,
    			Target.FACT,
    			Target.FACT );
    }
   
    public Evaluator getEvaluator(final ValueType type,
                                  final String operatorId,
                                  final boolean isNegated,
                                  final String parameterText,
                                  final Target left,
                                  final Target right ) {
    	
    	Double[] params = (Double[]) parser.parse(parameterText);
    	return new NearEvaluator(type, isNegated, params[0]);
    }

    public String[] getEvaluatorIds() {
        return SUPPORTED_IDS;
    }

    public boolean isNegatable() {
        return true;
    }

    public Target getTarget() {
        return Target.FACT;
    }

    public boolean supportsType(ValueType type) {
        return true;
    }
	
	
	/*  *********************************************************
     *           Evaluator Implementations
     *  *********************************************************
     */	
	
	
	public static class NearEvaluator extends BaseEvaluator {

        private static final long     serialVersionUID = 510l;
        public final static Evaluator INSTANCE         = new NearEvaluator();
        
        public NearEvaluator() {
            super( ValueType.OBJECT_TYPE, NEAR );
        }
		

        private Double distance;
          
        public NearEvaluator(final ValueType type, final boolean isNegated, final Double parameter) {
            super(type, isNegated ? NOT_NEAR : NEAR);
            this.distance = parameter;
        }		
		
		public boolean evaluate(InternalWorkingMemory workingMemory, InternalReadAccessor extractor, Object object, FieldValue value) {
			//final Object objectValue = extractor.getValue(workingMemory, object);
			throw new RuntimeDroolsException("The 'near' operator can only be used to compare one location to another, and never to compare to literal constraints.");
		}

		public boolean evaluate(InternalWorkingMemory workingMemory, 
								InternalReadAccessor leftExtractor, 
								Object left, 
								InternalReadAccessor rightExtractor, 
								Object right) {
			final Object value1 = leftExtractor.getValue(workingMemory, left);
            final Object value2 = rightExtractor.getValue(workingMemory, right);
			Location leftLocation 	= (Location) value1;
			Location rightLocation 	= (Location) value2;
			
			return this.getOperator().isNegated()^leftLocation.Near(rightLocation, this.distance);
			
		}

		public boolean evaluateCachedLeft(InternalWorkingMemory workingMemory, VariableContextEntry context, Object right) {
			final Location leftLocation = (Location)((ObjectVariableContextEntry) context).left;
			final Location rightLocation = (Location) context.extractor.getValue( workingMemory, right );
			
			if (context.object == right)
            	return false;
			
			if (leftLocation == null)
				return false;
            return this.getOperator().isNegated()^leftLocation.Near(rightLocation, this.distance);			

		}

		public boolean evaluateCachedRight(InternalWorkingMemory workingMemory, VariableContextEntry context, Object left) {
			final Location leftLocation = (Location) context.declaration.getExtractor().getValue( workingMemory, left );
            final Location rightLocation = (Location) ((ObjectVariableContextEntry) context).right;
            
            if (context.object == left)
            	return false;
            
            if (rightLocation == null)
				return false;
            return this.getOperator().isNegated()^leftLocation.Near(rightLocation, this.distance);
		}

		public Double getDistance() {
			return distance;
		}

		public void setDistance(Double distance) {
			this.distance = distance;
		}
		
		@Override
		public String toString() {
            return "NearEvaluatorDefinition near";

        }

	}
	
	private class DistanceParser implements EvaluatorParametersParser  {

		public Double[] parse(String paramText) {

			
	        if ( paramText == null || paramText.trim().length() == 0 ) {
	        	Double[] def = new Double[] {(double) 100};
	            return def;
	        }
	        
			paramText = new String(paramText.replaceAll("\"", ""));
	        
	        String trimmed = paramText.trim();	
            Double[] result = new Double[1];
			if ( trimmed.length() > 0 ) {
                result[0] = this.parseDistanceString(paramText);
            } else {
                throw new RuntimeDroolsException( "Empty parameters not allowed in: [" + paramText + "]" );
            }        
	        return result;
		}
		private Double parseDistanceString(String paramText) {
			
			Pattern DoublePattern = Pattern.compile("\\d+");
			Matcher matcher = DoublePattern.matcher(paramText);
			matcher.find();
			Double result = new Double(matcher.group());
			
			paramText = new String(paramText.replaceAll("\\d+", ""));
			
			Pattern pattern = Pattern.compile("\\D+");			
			matcher = pattern.matcher(paramText);
			matcher.find();
			String unity = matcher.group();
			
			if (unity.equals("m")) {
				result = result*Math.pow(10, 0);
			}
			
			if (unity.equals("dam")) {
				result = result*Math.pow(10, 1);
			}

			if (unity.equals("hm")) {
				result = result*Math.pow(10, 2);
			}			
			
			if (unity.equals("km")) {
				result = result*Math.pow(10, 3);				
			}
			
			return result;
		}
		
	}
	
}
