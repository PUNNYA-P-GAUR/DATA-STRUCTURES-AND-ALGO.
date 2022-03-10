package Linked_List;

import java.util.Scanner;
class Node
{
    int rollno;
    Node next;
}
public class SingleyLinkedlist
{
    Node START;
    SingleyLinkedlist()
    {
       START=null; 
    }
    
    void insert()
    {
        System.out.println("Enter your Roll Number ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        
        Node nn = new  Node();
        nn.rollno=data;
        nn.next=null;
        
        if(START==null)
        {
           START=nn; 
        }
        else
        {
            Node current=START;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=nn;
        }
        System.out.println("Node Inserted ....");
    }
    void delete()
    {
        System.out.println("Delete Function is working");    
    }
    void traverse()
    {
        if(START==null)
        {
            System.out.println("List Empty");
        }
        else
        {    
           System.out.println("----- Singly Linked List ELements ----");
           Node current;
           for(current=START;current!=null;current=current.next)
           {
              System.out.print(" "+current.rollno); 
           }
        }
              
    }
    public static void main(String[] args)
    {
        SingleyLinkedlist obj = new SingleyLinkedlist();
        while(true)
        {
            System.out.println("\nPress 1 for Insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for exit");
            System.out.println("Enter Your Choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }
                    
    }
}
