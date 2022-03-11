import java.util.Scanner;

public class Power_of_a_no_using_Recursion {
    static int power(int N, int P) {
        if (P == 0)
            return 1;
        return N*power(N,P-1);  //Recursive Call
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no");
        int N=s.nextInt();
        System.out.println("Enter the Value of Power upto to which you want to calculate");
        int P=s.nextInt();
        System.out.println("Calculated Result is" + "= "+ power(N,P));
    }
}
