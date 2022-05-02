import java.util.Scanner;

public class TwoSum {
    static Scanner s=new Scanner(System.in);
    public static int a=s.nextInt();
    public static int b=s.nextInt();
    public  int add(int a ,int b){
        if(a==0)
            return b;
        if(b==0)
            return a;
        return add(a,b-1)+1;
    }
    public static void main(String[] args) {
        TwoSum ts=new TwoSum();
        System.out.print(ts.add(a,b));

    }
}
