/*Write a program to swap two numbers using user-defines method.*/

import java.util.Scanner;
public class Swap{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Frist Number:");
		int x=sc.nextInt();
		System.out.print("Enter Second Number:");
		int y=sc.nextInt();
		Swap_demo sd=new Swap_demo();
		sd.swapnumber(x,y);
	}
}
class Swap_demo{
	public void swapnumber(int x,int y){
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("New Frist Number:"+x);
		System.out.print("New Second Number:"+y);
	}
}