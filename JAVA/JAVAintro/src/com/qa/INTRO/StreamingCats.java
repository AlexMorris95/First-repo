package com.qa.INTRO;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
public class StreamingCats {
	public static void main (String[] args) {
		 ArrayList<String> cats = new ArrayList<String>();
		cats.add("Clawdia");
		cats.add("JK Meowling");
		cats.add("Cat Damon");
		List<String> catList =cats.stream().map(cat-> cat.toUpperCase())
		.peek(cat->System.out.println(cat))
		.filter(cat-> !cat.equals ("CLAWDIA"))
		.peek(cat->System.out.println(cat))
		.collect(Collectors.toList());
		
	}
}
