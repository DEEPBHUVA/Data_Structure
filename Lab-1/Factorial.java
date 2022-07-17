// Write a program to find factorial of a number. (Using Loop)

import java.util.Scanner;

public class Factorial{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number for Factorial");
		int n=sc.nextInt();
		int i,fact=1;
		for (i=1;i<=n;i++) 
		{
			fact=fact*i;
		}
		System.out.print("Answer:");
		System.out.print(fact);
	}
}