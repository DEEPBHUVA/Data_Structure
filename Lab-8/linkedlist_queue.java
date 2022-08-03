 // Write a program to implement queue using singly linked list.

import java.util.Scanner;
class queue{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node front=null;
    Node rear=null;

    public void enqueue(int data){
        Node new_node=new Node(data);
        if(front==null){
            front=new_node;
            rear=new_node;
        } 
        else{
            rear.next=new_node;
            rear=new_node;
        }
    }

    public void dequeue(){
        if(front==null){
            System.out.println("Underflow!");
        }
        else{
            front=front.next;
        }
    }

    public void display(){
        Node temp=front;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

public class linkedlist_queue{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        queue qu=new queue();

        while(true){
        System.out.println("Enter 1 For enqueue");
        System.out.println("Enter 2 For dequeue");
        System.out.println("Enter 3 For Display");
        System.out.print("Enter Your Choice:");
        int c=sc.nextInt();

            if(c==1){
                System.out.println("Enter Data:");
                int data=sc.nextInt();
                qu.enqueue(data);
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