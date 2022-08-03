//Implement a program to create a node for singly linked list. Read the data in a node, print the node.
//node=addresh
//node.next=addresh of prevnode
//node.data=10,20,etc...
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

	public void insertAtmiddle(int data){
		Node new_node=new Node(data);
		if(head==null){							
			head=new_node;
		}
		else{
			int count=0;
			Node temp=head;
			while(temp!=null){
				temp=temp.next;
				count++;
			}
			//count=count+1;
			int i=0;
			Node last=head,prev=head;
			while(i<count/2){
				prev=last;
				last=last.next;
				i++;
			}
			prev.next=new_node;
			new_node.next=last;
			System.out.println("Addde!!");
		}
	}

	public void display(){
		Node temp=head;
		if(head==null){
			System.out.println("Linkedlist does not exist!!");
		}
		else{
			while(temp!=null){
				System.out.print(temp.data +" ");
				temp=temp.next;
			}
		}
	}
}
public class linkedlist_demo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		linkedlist ll=new linkedlist();

		while (true) {
			System.out.println();
			System.out.println("Enter 1 for Insert:");
			System.out.println("Enter 2 for Display:");
			System.out.println("Enter 3 for Insert At Middle:");
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

			else if(ch==3){
				System.out.println("Enter Data");
				int data=sc.nextInt();
				ll.insertAtmiddle(data);
			}
		}
	}
}