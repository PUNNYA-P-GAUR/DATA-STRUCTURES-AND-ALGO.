package src.QUEUE;
import java.util.Scanner;
public class Singly_Queue{
    int ar[];
    int front, rear;

    Singly_Queue() {
        ar = new int[100];
        front = -1;
        rear = -1;
    }

    void insert() {
        if (rear == ar.length - 1) {
            System.out.println("QUEUE OVERFLOW");
        } else {
            if (front == -1) {
                front = 0;
            }
            System.out.println("enter data");
            Scanner s = new Scanner(System.in);
            int data = s.nextInt();
            rear = rear + 1;
            ar[rear] = data;
            System.out.println("inserted");


        }
    }

    void delete() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else if (front == rear) {
            front = -1;
            rear = -1;

        } else if (front < rear) {
            front = front + 1;
        }
    }

    void alldelete() {
        if (front < rear) {
            front = rear + 1;
        }
    }

    void traverse() {
        if (front == -1 || rear == -1) {
            System.out.println("QUEUE IS EMPTY");
        } else {
            System.out.println("Singly queue");
            for (int i = front; i <= rear; i++) {
                System.out.println(" " + ar[i]);


            }
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        Singly_Queue obj = new Singly_Queue();
        while (true) {
            System.out.println("press 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("preess 3 for traverse");
            System.out.println("press 4 for exit");
            System.out.println("press 5 for delete all elements of queue");
            System.out.println("enter your choice");
            Scanner sc = new Scanner(System.in);

            int choice = sc.nextInt();
            switch (choice) {
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
                case 5:
                    obj.alldelete();
                    break;
                default:
                    System.out.println("wrong choice");

            }
        }
    }
}
