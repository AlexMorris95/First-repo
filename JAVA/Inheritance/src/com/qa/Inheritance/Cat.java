package com.qa.Inheritance;

public class Cat extends Mammal {
	
	private String size ;
	
	Cat(String size, String speak){
	super(speak);
	this.size=size;
	}
	public String getSize()
	{
		return size;
	}
		//public String toString() {
		//	return "The great Catsby";
		// }
	

}
