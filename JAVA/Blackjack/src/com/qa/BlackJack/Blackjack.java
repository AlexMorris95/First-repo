package com.qa.BlackJack;



public class Blackjack {
	public static void main (String[] args){
		int a = 17;
		int b = 20;
		int c = 25;
		int d = 21;
		int e = 19;
		int f = 28;
		int win= twentyone(f,c);
		System.out.println(win);
	}
	public static int twentyone(int p1 , int p2) {
	if (p1>21)
		{p1=0;}
	if (p2>21)
		{p2=0;}
	
	int M1 = Math.max(p1, p2);
	
			return M1;
	}
}



