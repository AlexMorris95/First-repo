package com.qa.UniqueSum;

public class UniqueSum {
	public static void main (String[] args) {
		int A = 5 ;
		int B = 8 ;
		int C = 13;
		int D = 13;
		int E = 5 ;
		int F = 13;
		int USum= uSum(B,B,B);
		System.out.println(USum);
	}
	public static int uSum(int P1 , int P2,int P3) {
	if (P1==P2)
		{P2=0;}
	if (P1==P3)
	    {P3=0;}
	if (P2==P3)
	    {P3=0;}
	int S = (P1 + P2 + P3);
	  return S;
     }
 
}