package com.qa.PeopleTask;

import java.util.ArrayList;

public class People {
public String name;
public int age ;
private String jobTitle;
public static ArrayList<People> peopleCatalogue = new ArrayList<People>();

 People(String name , int age , String jobTitle ){
	 this.name=name;
	 this.age=age   ;
	 this.jobTitle=jobTitle;
	 People.peopleCatalogue.add(this);
	 
	
 }
public String getjobTitle()  {
		 return this.jobTitle;
		 }
@Override
public String toString() {
	return "People [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
}
}
