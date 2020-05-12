// Name: Jinfeng (Jeffery) Liu
// Email: liujinfeng1209@gmail.com
// Phone: 778-387-9021

// Programming language: Java
// IDE: Eclipse

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		// To check nth Fibonacci number, please replace "9" in "recursion(9)" with n.
		System.out.println("The nth element of Fibonacci sequence is " + recursion(9));
	}	
	
	public static long recursion(int n)	{
		if(n <= 1)
			return n;		
		return recursion(n - 1) + recursion(n - 2);
	}
}
