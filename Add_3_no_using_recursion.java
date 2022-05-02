
import java.util.Scanner;

public class TwoSum {
    static Scanner s = new Scanner(System.in);
    public static int a = s.nextInt();
    public static int b = s.nextInt();
    public static int c = s.nextInt();

    public int add(int a, int b, int c) {
        if (a == 0 && c == 0)
            return b;
        if (b == 0 && c == 0)
            return a;
        if (a == 0 && b == 0)
            return c;
        return add(a, a - b, b- c) + a + b;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        System.out.println(ts.add(a, b, c));
    }
}
