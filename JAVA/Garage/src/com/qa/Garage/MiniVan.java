package com.qa.Garage;

class MiniVan extends Vehicle {
public int capacity;
 MiniVan( String owner ,int weight, int wheels , int value, int capacity){
 super(owner, weight ,wheels, value);
 this.capacity=capacity;
	Garage.catalogue.add(this);

 }
 public int getprice() {
		return (400);
 }
}
