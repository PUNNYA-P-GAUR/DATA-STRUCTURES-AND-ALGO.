import java.util.Scanner;

public class Insertion_sort {
    public void Inssort(int[]arr){
        for(int i=1;i< arr.length;i++) {
            int temp = arr[i];
            int pos = i - 1;
        while(pos>=0 && temp<arr[pos]) {
                arr[pos + 1] = arr[pos];
                pos = pos-1;
        }
        arr[pos+1]=temp;
        }
    }
    public void printarr(int[]arr){
        for (int j=0;j< arr.length;j++) {
            System.out.print(arr[j]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size");
        int n=s.nextInt();
        System.out.println("enter array ele");
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        Insertion_sort is=new Insertion_sort();
        is.Inssort(arr);
        is.printarr(arr);
    }
}
