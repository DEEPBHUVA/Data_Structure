// Implement Simple Queue using array that performs following operations: INSERT, DELETE, DISPLAY

import java.util.Scanner;
class queue{
	int n=10;
	int rear=-1,front=-1,temp;
	int a[]=new int[n];

	void enqueue(int i){
		if(rear>=n-1){
			System.out.println("Overflow!!");
		}
		else{
			if(rear==-1){
				front=0;
			}
				rear++;
				a[rear]=i;
		}
	}

	void dequeue(){
		if(rear<=0){
			System.out.println("Underflow!!");
		}
		else{
			temp=front;
			front++;
			System.out.println("Qequeue!!");
		}
	}

	void display(){
		System.out.println("Items are:");
		for(int i=front;i<=rear;i++){
			System.out.println(a[i]);
		}
	}
}

public class Queue_demo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		queue qu=new queue();

		while(true){
		System.out.print("Enter 1 For enqueue"+" ");
		System.out.println();
		System.out.print("Enter 2 For dequeue"+" ");
		System.out.println();
		System.out.print("Enter 3 For Display"+" ");
		System.out.println();
		System.out.print("Enter Your Choice:");
		int c=sc.nextInt();

			if(c==1){
				System.out.println("Enter Data:");
				int i=sc.nextInt();
				qu.enqueue(i);
			}
			else if(c==2){
				qu.dequeue();
			}		
			else if(c==3){
				qu.display();
			}
		}	
	}
}