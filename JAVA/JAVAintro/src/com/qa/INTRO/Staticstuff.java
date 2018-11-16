package com.qa.INTRO;

public class Staticstuff {
	public static String cat="Pippa"; // add or remove static here
	public static void  main(String[] args) {
	Staticstuff myApp  = new Staticstuff();
	Staticstuff myApp1 = new Staticstuff();
	myApp.cat=  "Pippa";
    myApp1.cat= "Jack";
    System.out.println(myApp.cat);
    System.out.println(myApp1.cat);
	}
}
// If static is used in line 4 it create a static instance that is applied to all 
// myApp
// if static is not used each cat has to bve put into each app separetly