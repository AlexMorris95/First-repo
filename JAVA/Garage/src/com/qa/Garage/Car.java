package com.qa.Garage;

 class Car extends Vehicle {
	 public Boolean turbo;
	 public String style;
	 
	 
	 
	 Car( String owner ,int weight, int wheels , int value, Boolean turbo, String style){
	 super(owner, weight ,wheels, value);
	 this.turbo=turbo;
	 this.style=style;
		Garage.catalogue.add(this);
	 }
public int getprice() {
	return (300);
	
}
	 }
	 

