import java.util.*;
class recusion1{
    public  static void rev(int i,int arr[],int n){
        if(i>arr.length/2){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        rev(i+1,arr,n);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=s.nextInt();
        }
        rev(0,arr,n);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
