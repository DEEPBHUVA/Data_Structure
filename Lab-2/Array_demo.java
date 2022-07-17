// Read n numbers in an array then read two different numbers, replace 1st number with 2nd number 
// in an array and print its index and final array.

import java.util.Scanner;
public class Array_demo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter size of Array:");
		int n=sc.nextInt();

		int a[]=new int[n];

		System.out.print("Enter The Array Elements:");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();

		System.out.print("Enter number to find in Array list:");
		int x=sc.nextInt();
		System.out.print("Enter number to replace with Array list:");
		int y=sc.nextInt();

		for(int i=0;i<a.length;i++){
			if(x==a[i]){
				a[i]=y;
			}
			else{}
		}
		System.out.print("Your Updated Array list is:-");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}