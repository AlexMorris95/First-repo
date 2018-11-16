package com.qa.INTRO;

public class ExampleMethod {
 static	int x = 5 ;
 static int y =4 ;
public static void main (String[] args) {
      y = 6 ; // this overrides the global variable 4 with 6 but it remains global
	for (int i = 0; i<1;i++)
    {
	System.out.println(i);
	}
System.out.println(y);
//System.out.println(i);
System.out.println(x);
other();
}
public static void other()
{
	System.out.println(y);
//	System.out.println(i);
	System.out.println(x);
// sys out y failing because this  'other' does not communicate values with main . except global

}
}
