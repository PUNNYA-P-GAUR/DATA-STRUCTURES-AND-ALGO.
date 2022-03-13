package Arrays;
import java.util.*;
public class Reverse_Array {
    public void Reverse(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size -");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = s.nextInt();
        }
            int j = arr.length-1;
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;

            }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Reverse_Array rs = new Reverse_Array();
        rs.Reverse();
        }
    }
