//Sorted Linkedlist...

import java.util.Scanner;

class linkedlist{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	public void insert(int data){
		Node new_node=new Node(data);
		if(head==null){							
			head=new_node;
		}
		else{
			new_node.next=head;
			head=new_node;
		}
	}

	public void display(){
		Node temp=head;
		Node next=null;
		int ans=0;
		if(head==null){
			System.out.println("Linkedlist does not exist!!");
		}
		else{
			while(temp!=null){
				next=temp.next;
				while(next!=null){
					if(temp.data>next.data){
						ans=temp.data;
						temp.data=next.data;
						next.data=ans;
					}
				next=next.next;
			}
				temp=temp.next;
			}
		}
		    temp=head;
			while(temp.next!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.print(temp.data);
	}
}
public class sort_linkedlist{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		linkedlist ll=new linkedlist();

		while (true) {
			System.out.println();
			System.out.println("Enter 1 for Insert:");
			System.out.println("Enter 2 for Display:");
			System.out.print("Enter Your Choice: ");
			int ch=sc.nextInt();

			if(ch==1){
				System.out.println("Enter Data");
				int data=sc.nextInt();
				ll.insert(data);
			} 
			else if(ch==2){
				ll.display();
			}
		}
	}
}