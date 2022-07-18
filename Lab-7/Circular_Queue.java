// Implement Circular Queue using array that performs following operations: INSERT, DELETE, DISPLAY

import java.util.Scanner;
class circular{
	int n=6;
	int rear=-1,front=-1,temp;
	int a[]=new int[n];

	void enqueue(int i){
		if((rear+1)%n==front){
			System.out.println("Overflow!!");
		}
		else{
			if(rear==-1 && front==-1){
				rear=front=0;
				a[rear]=i;
			}
			else{
				rear=(rear+1)%n;
				a[rear]=i;
			}
		}
	}

	void dequeue(){
		if(rear==-1 && front==-1){
			System.out.println("Underflow!!");
		}
		else if(front==rear){
			front=-1;
			rear=-1;
		}
		else{
			temp=front;
			front++;
			System.out.println("Qequeue!!");
		}
	}

	void display(){
		int j;
		System.out.println("Items are:");
		for(j=front;j!=rear;j=(j+1)%n){	
			System.out.println(a[j]);
		}
		System.out.println(a[j]);
	}
}

public class Circular_Queue{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		circular cq=new circular();

		while(true){
		System.out.print("Enter 1 For enqueue");
		System.out.println();
		System.out.print("Enter 2 For dequeue");
		System.out.println();
		System.out.print("Enter 3 For Display");
		System.out.println();
		System.out.print("Enter Your Choice:");
		int c=sc.nextInt();

			if(c==1){
				System.out.println("Enter Data:");
				int i=sc.nextInt();
				cq.enqueue(i);
			}
			else if(c==2){
				cq.dequeue();
			}		
			else if(c==3){
				cq.display();
			}
		}	
	}
}