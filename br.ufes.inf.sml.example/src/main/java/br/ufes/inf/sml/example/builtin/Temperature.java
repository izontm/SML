package br.ufes.inf.sml.example.builtin;

public class Temperature implements Comparable<Temperature> {

	private Double value;
	
	public Temperature(double value){
		this.value = value;
	}
	
	@Override
	public int compareTo(Temperature o) {
		return this.value.compareTo(o.getValue());
	}

	private Double getValue() {
		return value;
	}
	

}
