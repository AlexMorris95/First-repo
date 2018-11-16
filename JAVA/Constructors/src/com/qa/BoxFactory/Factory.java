package com.qa.BoxFactory;

public class Factory {
	public static void main ( String[] args) {
	Box box = new Box("Black","medium",300); // send request for new box with colour black
	Box boxy= new Box("Blue","large", 500); // " with blue
	System.out.println(box.colour);
	System.out.println(boxy.colour);
	}
	
	

}
