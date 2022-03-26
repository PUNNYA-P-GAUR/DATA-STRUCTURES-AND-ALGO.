import java.util.Scanner;

public class String_Reverse_Recursion {
    public String Reverse(String s){
        if(s.length()==0){
            return "Empty String";
        }
        if(s.length()==1){
            return s;
        }
        return s.charAt(s.length()-1)+Reverse(s.substring(0,s.length()-1));                   //RECURSIVE CALL
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String"+"\n");
        String s=scan.nextLine();
        String_Reverse_Recursion str=new String_Reverse_Recursion();
        System.out.println(str.Reverse(s));
    }
}
