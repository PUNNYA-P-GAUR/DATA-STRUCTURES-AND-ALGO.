import java.util.Scanner;

public class TwoSum {
    static Scanner s = new Scanner(System.in);
    public static int a = s.nextInt();

    public int add(int a) {
        if(a==0)
            return 0;
        return a+add(a-1);
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        System.out.println(ts.add(a));
    }
}
