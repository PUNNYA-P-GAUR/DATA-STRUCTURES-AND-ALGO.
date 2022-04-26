import java.lang.*;
import java.util.Stack;

class PalindromeNo{
    public boolean check(int n) {

        String in = String.valueOf(n);
        char[] input = in.toCharArray();
        Stack<Character> inpstack = new Stack<>();
        Stack<Character> outstack = new Stack<>();
        for (int i = 0; i < in.length(); i++) {
            inpstack.push(input[i]);
            outstack.push(input[in.length() - i - 1]);
        }
        return outstack.equals(inpstack)?true:false;
    }
    public static void main(String[] args) {
        PalindromeNo p=new PalindromeNo();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(p.check(n));
    }
}
