package br.ufes.inf.sml.example.model;

import br.ufes.inf.sml.example.builtin.*;

// Start of user code for imports
// 
// import java.lang.*
//
// End of user code

public abstract class SpatialEntity {

	// Start of user code for constructors and methods
	/* 
	public SpatialEntity() {
		this.setLocation;
	}
	*/
	// End of user code
	
	private Location location;

	public void setLocation(Location location) {
		this.location = location;
	}

	public Location getLocation() {
		return location;
	}
	
}
