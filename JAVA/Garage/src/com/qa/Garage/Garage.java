package com.qa.Garage;

import java.util.ArrayList;

public class Garage {

	public static ArrayList<Vehicle> catalogue = new ArrayList<Vehicle>();// initiates the arraylist works for singular garage

public static void main(String[] args){
	// weight wheels values 
	// Cars have turbo boolean and style
	// Motor bikes have backSeat boolean
	//ArrayList<Vehicles>
	Vehicle V1= new Car("mikey",800, 4, 15000, false ,"Saloon");
	Vehicle V2= new Car("Sarah",500,4, 12000, true, "Hatchback");
	//catalogue.add(V1);
	//catalogue.add(V2);
	for ( Vehicle v : catalogue ) {
	System.out.println(v.getowner()); 
	System.out.println(Vehicle.getprice);
	
	}
}
}
