package br.ufes.inf.sml.example.builtin;

public class Monetary implements Comparable<Monetary> {

	private Double value;
	
	public Monetary(double value){
		this.value = value;
	}
	
	public Monetary(String value){
		this.value = new Double(value.replace("$", ""));
	}
	
	@Override
	public int compareTo(Monetary o) {
		return this.value.compareTo(o.getValue());
	}

	private Double getValue() {
		return value;
	}
	

}
