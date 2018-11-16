package com.qa.sacnners;

import java.util.Scanner;

public class Lecture {
public static void main(String[] args){
	Lecture today = new Lecture();
	System.out.println(today.input());
	
}

public String input() {
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	
	return input;
			}
}
// 