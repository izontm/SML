package br.ufes.inf.sml.example;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderConfiguration;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.builder.conf.EvaluatorOption;

import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.situation.base.SituationHelper;

import br.ufes.inf.sml.example.model.*;
import br.ufes.inf.sml.example.situation.*;
import br.ufes.inf.sml.example.builtin.*;
// Start of user code for imports
// 
// import java.lang.*
//
// End of user code

/**
 * This is a sample class to launch a rule.
 */

public class Main {

	static RuleEngineThread engine = null;
	
    public static final void main(String[ ]  args) {
        try {
            // load up the knowledge base
            KnowledgeBase kbase = readKnowledgeBase();
            StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
            engine = new RuleEngineThread(ksession);
            engine.start();
            
			// Start of user code for initial ksession objects
			// Insert initial objects in knowledge session, for instance:
			// 
			// Person p = new Person("Mary");
			// ksession.insert(p);
			// 
			// End of user code
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private static KnowledgeBase readKnowledgeBase() throws Exception {
    	
    	KnowledgeBuilderConfiguration builderConf = KnowledgeBuilderFactory.newKnowledgeBuilderConfiguration();
        SituationHelper.setBuilderConfSituationAwareness(builderConf);
		// Start of user code for aditional conf
		// Insert aditional options here, for instance:
		// 
		builderConf.setOption(EvaluatorOption.get("near", new NearEvaluatorDefinition()));
		// 
		// End of user code
    	KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder(builderConf);
    	SituationHelper.setKnowledgeBuilderSituationAwareness(kbuilder);
        
    	//Rule Resources
    	kbuilder.add(ResourceFactory.newClassPathResource("sml.drools"), ResourceType.DRL);

		// Start of user code for aditional resources
		// Insert aditional resources here, for instance:
		// 
		// kbuilder.add(ResourceFactory.newClassPathResource("my.drl"), ResourceType.DRL);
		// 
		// End of user code
   
        SituationHelper.refactorSaliences(kbuilder);
        
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        if (errors.size() > 0) {
            for (KnowledgeBuilderError error: errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }        

        
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
        
        return kbase;
    }

}

