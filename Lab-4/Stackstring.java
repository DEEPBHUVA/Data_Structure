// Write a program to determine if an input character string is of the form aibi where i >= 1 i.e. 
// Number of ‘a’ should be equal to number of ‘b’.

import java.util.Scanner;
public class Stackstring{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char a[]=new char[100];
		System.out.print("Enter String:");
		String str=sc.next();
		char temp;
		
		int counta=0,countb=0;
		for(int i=0;i<str.length();i++){
			temp=str.charAt(i);
			a[i]=temp;

			if(temp=='a'){
				counta++;
			}
			else if(temp=='b'){
				countb++;
			}
		}
		System.out.println("Counta:"+counta);
		System.out.println("Countb:"+countb);
		if(counta==countb){
			System.out.println("Your String is Valid");
		}
		else{
			System.out.println("Your String is Not Valid");
		}
	}
}