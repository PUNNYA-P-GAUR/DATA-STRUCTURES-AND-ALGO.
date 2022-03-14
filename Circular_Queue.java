package src;

;import java.util.*;
@SuppressWarnings("InfiniteLoopStatement")
public class Circular_Queue {
    int[] arr =new int[10];
    int front;
    int rear;
    Circular_Queue(){
        front=-1;
        rear=-1;
    }
    public void insert(){
        if(front==0  && rear==4 || rear==front-1 || front==rear+1){
            System.out.println("CIRCULAR QUEUE IS FULL");
        }
        else{
            System.out.println("ENTER DATA");
            Scanner s=new Scanner(System.in);
            int data=s.nextInt();
            if(front==-1){
                front=0;
            }
            if(rear<4){
                rear++;
                arr[rear]=data;
            }
            else if(rear==4 && front!=0){
                rear=0;
                arr[rear]=data;
                System.out.println("DATA INSERTRED");
            }
        }
    }
    public void delete(){
        int temp;
        if(front==-1){
            System.out.println("QUEUE IS EMPTY");

        }
        else if(front==rear){
            front=-1;
            rear=-1;

        }
        else{
            if(front==arr.length-1){
                front=0;}

            else{
                front++;
            }
        }
    }
    public void traverse(){
        if(front==-1 || rear==-1){
            System.out.println("QUEUE IS EMPTY");
        }
        else{
            if(front<=rear){
                for(int i=front;i<=rear;i++){
                    System.out.println(" "+arr[i]);
                }
            }
            else if(rear<front){
                for(int i=front;i<=arr.length-1;i++){
                    System.out.println(" "+arr[i]);
                }
                for(int i=0;i<=rear;i++){
                    System.out.println(" "+arr[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Circular_Queue cq=new Circular_Queue();
        while(true){
            int choice;
            System.out.println("PRESS 1 FOR INSERT");
            System.out.println("PRESS 2 FOR DELETE");
            System.out.println("PRESS 3 FOR TRAVERSE");
            System.out.println("ENTER YOUR CHOICE");
            Scanner s=new Scanner(System.in);
            choice=s.nextInt();
            switch (choice) {
                case 1 -> cq.insert();
                case 2 -> cq.delete();
                case 3 -> cq.traverse();
            }
        }
    }
}
