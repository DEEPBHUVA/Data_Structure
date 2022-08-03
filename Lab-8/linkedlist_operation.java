// . Write a menu driven program to implement following operations on the singly linked list.
// 	a. Insert a node at the front of the linked list.
// 	b. Display all nodes.
// 	c. Delete a first node of the linked list.
// 	d. Insert a node at the end of the linked list.
// 	e. Delete a last node of the linked list.
// 	f. Delete a node from specified position.

import java.util.Scanner;
class linkedlist{
	static Scanner sc=new Scanner(System.in);
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;

	public void insert(int data,int choice){
		Node new_node=new Node(data);
		if(head==null){
			head=new_node;
		}
		else{
			switch(choice){
			case 1 :
				new_node.next=head;
				head=new_node;
				break;

			case 2 :
				Node temp=head;
				while(temp.next!=null){
					temp=temp.next;
				}
				temp.next=new_node;
				break;

			case 3 :
				System.out.println("Enter Position Of Node To Be Inserted:");
				int p=sc.nextInt();
				Node temp1=head;
				for(int i=0;i<(p-1);i++){
					temp1=temp1.next;
				}
				new_node.next=temp1.next;
				temp1.next=new_node;
				break;
		}
	}
}

	public void delete(int dchoice){
		if(head==null){
			System.out.println("Linkedlist does not exist!!");
		}
		else{
			switch(dchoice){
			case 1:
				Node temp=head;
				temp=temp.next;
				head=temp;
				break;

			case 2:
				Node temp1=head;
				Node ptr=temp1.next;
				while(ptr.next!=null){
					temp1=ptr;
					ptr=ptr.next;
				}
				temp1.next=null;
				break;

			case 3:
				Node temp2=head;
				Node ptr1=temp2.next;
				System.out.println("Enter Position Of Node To Be Deleted:");
				int m=sc.nextInt();
				for(int i=0;i<(m-1);i++){
					temp2=ptr1;
					ptr1=ptr1.next;
				}
				temp2.next=ptr1.next;
				break;
			}
		}
	}

	public void display(){
		Node temp=head;
		if(head==null){
			System.out.println("Linkedlist does not exist!!");
		}
		else{
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}
}
public class linkedlist_operation{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		linkedlist ll=new linkedlist();

		while (true) {
			System.out.println();
			System.out.println("Enter 1 for Insert:");
			System.out.println("Enter 2 for Display:");
			System.out.println("Enter 3 for Delete:");
			System.out.print("Enter Your Choice: ");
			int ch=sc.nextInt();

			if(ch==1){
				System.out.println("Enter 1 for Insert a node at the front of the linked list:");
				System.out.println("Enter 2 Insert a node at the end of the linked list:");
				System.out.println("Enter 3 for Insert at paticular Position:");
				System.out.print("Enter Case:");
				int choice=sc.nextInt();
				System.out.println("Enter Data");
				int data=sc.nextInt();
				ll.insert(data,choice);
			} 
			else if(ch==2){
				ll.display();
			}
			else if(ch==3){
				System.out.println("Enter 1 for Delete a first node of the linked list:");
				System.out.println("Enter 2 for Delete a last node of the linked list:");
				System.out.println("Enter 3 for Delete a node from specified position:");
				System.out.print("Enter Case:");
				int dchoice=sc.nextInt();
				ll.delete(dchoice);
			} 
		}
	}
}

