// . Write a program to implement stack using singly linked list.

import java.util.Scanner;

class stack{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node top=null;
	public void push(int data){
		Node new_node=new Node(data);
		if(top==null){
			top=new_node;
		}
		else{
			new_node.next=top;
			top=new_node;
		}
	}

	public void pop(){
		Node temp=top;
		if(top==null){
			System.out.println("Stack is Empty!");
		}
		else{
			temp=temp.next;
			top=temp;
		}
	}

	public void display(){
		Node temp=top;
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
}

public class linkedlist_stack{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		stack st=new stack();

		while(true){
			System.out.println("Enter 1 for Push:");
			System.out.println("Enter 2 for Pop:");
			System.out.println("Enter 3 for Display:");
			System.out.println("Enter Choice:");
			int ch=sc.nextInt();

			if(ch==1){
				System.out.println("Enter Data");
				int data=sc.nextInt();
				st.push(data);
			}

			else if(ch==2){
				st.pop();
			}

			else if(ch==3){
				st.display();
			}
		}
	}
}