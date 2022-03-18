import java.util.Scanner;
import java.lang.System;
class Node{
        int data;
        Node next;
        Node(int d){
            Scanner s=new Scanner(System.in);
            this.data=s.nextInt();
            this.next=null;
        }
}
public class Queue_Using_LL {
    Node front;
    Node rear;
    Queue_Using_LL(){
        this.front=null;
        this.rear=null;
    }
    public void Enqueue() {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE DATA");
        int d=s.nextInt();
        Node node = new Node(d);
        if (rear == front) {
            front = node;
            rear = front;
        } else {
            rear.next = node;
            rear = node;
        }
    }
    public void Dequeue(){
        if(front!=null) {
            System.out.println(front.data);
            if (rear == front)
                front = rear = null;
            else {
                front = front.next;
            }
        }
        else
            System.out.println("Empty");
    }
    public void Display(){
        if(front==null){
            System.out.println("Empty");
        }
        else{
            Node temp=front;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Queue_Using_LL ql=new Queue_Using_LL();
        while (true){
            Scanner s=new Scanner(System.in);
            System.out.println("Press 1 to Enter");
            System.out.println("Press 2 to delete");
            System.out.println("Press 3 to display");
            System.out.println("Press 4 to Exit");
            System.out.println("enter the choice whose operation you want to perform");
            int choice;
            choice=s.nextInt();
            switch (choice) {
                case 1 -> {
                    ql.Enqueue();}
                case 2->ql.Dequeue();
                case 3->ql.Display();
                case 4-> System.exit(0);
                default -> System.out.println("WRONG CHOICE");
            }
        }
    }
}
