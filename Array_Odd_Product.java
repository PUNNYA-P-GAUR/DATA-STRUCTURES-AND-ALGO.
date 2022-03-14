import java.lang.*;
import java.util.*;
public class Array_Odd_Product {
    public void oddProduct() {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=s.nextInt();
        }
        int c = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] * arr[j]) % 2 != 0) {
                    c = 1;
                    break;
                }
            }
            if (c == 1) {
                break;
            }
        }
        System.out.println(c == 1);
    }

    public static void main(String[] args) {
        Array_Odd_Product op = new Array_Odd_Product();
        op.oddProduct();
    }
}
