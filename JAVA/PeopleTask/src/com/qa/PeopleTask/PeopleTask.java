package com.qa.PeopleTask;
	import java.util.ArrayList;
	import java.util.stream.Collectors;

import javax.naming.directory.SearchResult;

import java.util.List;

public class PeopleTask {
	
public static void main(String[] args) {
			

People person = new People("Lil Zan",123,"Druid");
People person1 = new People("Stir fry",25,"Ranger");
People person2 = new People("Kaelis",23,"Wizard");
People person3 = new People("MoonMoon", 6,"Wolf");
People person4 = new People("SunSun", 6, "Wolf");
People person5 = new People("Bran flakes",25,"Village idiot");
People person6 = new People("Glassstaff", 52,"Sorcerer");
People person7 = new People("Gundrun" ,47,"Proffesional Dwarf");
People person8 = new People("Karl", 14, "Bugbear");

 PeopleTask SR=new PeopleTask();
 int rIndex= SR.searchReturn("Lil Zan");
 System.out.println(rIndex);
 System.out.println(People.peopleCatalogue.get(rIndex).toString());
}


public int searchReturn(String sName) 
{
for (People people : People.peopleCatalogue) {
	if (people.name.equals(sName)) {
	 int indexRet =  People.peopleCatalogue.indexOf(people);
	 return indexRet;
	}
	
	System.out.println(getjobTitle);
	}
//System.out.println(person.jobTitle);
return 0;
}
}
