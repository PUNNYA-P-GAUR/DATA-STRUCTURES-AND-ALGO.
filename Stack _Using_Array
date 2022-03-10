import java.util.*;
public class stack2 {
    Scanner sc = new Scanner(System.in);
    int[] stack;
    int top;
    stack2()
    {
        stack=new int[5];
        top=-1;
    }
    void push()
    {
        if(top==stack.length-1){
            System.out.println("Stack is full");
        }
        else
        {
            System.out.println("Enter element");
            var el = sc.nextInt();
            stack[++top]=el;
        }
       
    }
    void pop()
    {
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else
        {
            int temptop=stack[top];
            top--;
            
        }
    }
    void peek(){
        if (top==-1){
            System.out.println("SACK IS EMPTY");
        }
        else{
            System.out.println(stack[top]);
        }
    }
    void display()
    {
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            for (int i : stack) {
                System.out.println(i);
            }        
        }
    }
    public static void main(String[] args) {
        stack2 obj = new stack2();
        while (true) {
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for view");
            System.out.println("Press 4 for peek");
            System.out.println("PRESS 5 FOR EXIT");
            System.out.println("\nEnter your choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> obj.push();
                case 2 -> obj.pop();
                case 3 -> obj.display();
                case 4 -> obj.peek();
                case 5 -> System.exit(0);
                default -> System.out.println("Wrong choice");
            }
                    
        }
   
    }
    
}
