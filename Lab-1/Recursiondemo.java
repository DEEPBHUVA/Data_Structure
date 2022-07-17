// Write a program to find factorial of a number. 

import java.util.Scanner;
public class Recursiondemo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number To Find Factroial:");
		int n=sc.nextInt();

		Recursionex re=new Recursionex();
		System.out.println("Factroial is:"+re.fact(n));

	}
}
class Recursionex{
		int fact(int n){
			if(n==0){
				return 0;
			}
			else{
				return fact(n-1)*n;
			}
	}
}
