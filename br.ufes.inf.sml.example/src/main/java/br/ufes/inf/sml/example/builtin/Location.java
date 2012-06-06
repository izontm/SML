package br.ufes.inf.sml.example.builtin;

public class Location {
	
	private Double longitude;
	private Double latitude;
	
	public Location(Double latitude, Double longitude){
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Location(String value){
		this.latitude = new Double(0);
		this.longitude = new Double(0);
	}
	
	
	public Double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	public boolean Near(Location loc, Double distance) {
	  Double earthRadius = (6.37814)*Math.pow(10, 6); //earth radius in meters	  
	  Double dLat = Math.toRadians(loc.getLatitude() 	- this.getLatitude() );
	  Double dLng = Math.toRadians(loc.getLongitude() - this.getLongitude());
	  Double sindLat = Math.sin(dLat / 2);
	  Double sindLng = Math.sin(dLng / 2);
	  Double a = Math.pow(sindLat, 2) + Math.pow(sindLng, 2) * Math.cos(this.getLatitude()) * Math.cos(loc.getLongitude());
	  Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
	  Double dist = earthRadius * c;		
	
	  //System.out.println("distance: " + dist);
	  
	  return dist < distance;
	}

}
