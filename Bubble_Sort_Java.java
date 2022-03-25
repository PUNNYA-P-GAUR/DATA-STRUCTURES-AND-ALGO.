import java.util.Scanner;

public class Bubble_Sort1 {
    public void bsort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++) {                           //Pass Loop
            for (int j = 0; j<n-1-1; j++) {                     //Comparison Loop
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }//Pass Loop Ends
    }
    public void PrintA(int []arr){
        for (int j=0;j< arr.length;j++) System.out.println(arr[j]);
    }

    public static void main(String[] args) {
        Bubble_Sort1 bs=new Bubble_Sort1();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=s.nextInt();
        System.out.println("Enter the arrelements");
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=s.nextInt();
        bs.bsort(arr);
        bs.PrintA(arr);

    }
}
