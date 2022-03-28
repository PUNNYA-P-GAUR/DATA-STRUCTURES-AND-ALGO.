import java.util.Scanner;

public class Quick_Sort {
    public int partition(int[] arr,int low, int high){
        int i = low - 1;

        for (int j = low; j <= high ; j++) {
            if(arr[j] <= arr[high]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }

    public void quickSort(int[] arr,int low,int high){
        if(low < high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);                                       //Recursive call
            quickSort(arr,pivot+1,high);                                      //Recursive call
        }
    }

    public void display(int []arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        Quick_Sort obj = new Quick_Sort();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        obj.quickSort(arr,0,arr.length-1);
        obj.display(arr);
    }
}
