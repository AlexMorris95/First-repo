package com.qa.BoxFactory;

public class BoxFactory {
public static void main ( String[] args) 
{	Factory b1 = new Factory();
	b1.item= "Clothes";
	Factory b2 = new Factory();
	b2.item = "Shoes";
	Factory.colour="Silver";
	System.out.println(b1.item);
	System.out.println(b2.item);
	System.out.println(Factory.colour);
	BoxFactory bF1=new BoxFactory();
	System.out.println(bF1.num());
	}
	
	public int num() {
		return 4;
	}
	
}

