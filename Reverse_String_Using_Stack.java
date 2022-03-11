import java.util.Scanner;
import java.util.Stack;
public class Rev_String_Using_Stack {

        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            String inputString = in.nextLine();
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < inputString.length(); i++) {
                stack.push(inputString.charAt(i));
            }

            StringBuilder reverseString = new StringBuilder();

            while (!stack.isEmpty()) {
                reverseString.append(stack.pop());
            }
            System.out.println("Reversed String is"+" "+reverseString);


        }
}
