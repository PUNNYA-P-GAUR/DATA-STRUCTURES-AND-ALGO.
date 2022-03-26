import java.util.Scanner;

public class Linear_Search_Recursion {
    public void Lsearch(int []arr,int start,int end,int value){
        if(start > end){
            System.out.println("Value not Found");
            return;
        }
        if(arr[start] == value){
            System.out.println("Value Found on Index: " + start);
            return;
        }
        if(arr[end] == value){
            System.out.println("Value Found on Index: " + end);
            return;
        }
        Lsearch(arr,start+1,end-1,value);
    }

    public static void main(String[] args) {
        Linear_Search_Recursion lsr = new Linear_Search_Recursion();
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size");
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i< arr.length;i++) {
            arr[i] = s.nextInt();
        }
        int value=s.nextInt();

        lsr.Lsearch(arr,0,arr.length-1,value);
        lsr.Lsearch(arr,0,arr.length-1,value);
    }
}

