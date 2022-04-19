//WAP to find the first and last occurrence of an element in an array using recursion
import java.util.Scanner;
public class FirstAndLastOccu{
    public int firstocc(int []arr,int curr,int target){
        if(curr==arr.length)
            return -1;
        if(arr[curr]==target)
            return curr;
        return firstocc(arr,curr+1,target);
    }
    public int lastocc(int []arr,int curr,int target){
        if(curr==-1)return -1;
        if (arr[curr]==target)
            return curr;
        return lastocc(arr,curr-1,target);
    }

    public static void main(String[] args) {
        FirstAndLastOccu flo=new FirstAndLastOccu();
        Scanner s=new Scanner(System.in);
        System.out.println("ENter the size");
        int n=s.nextInt();
        int []arr=new int[n];
        System.out.println("enter the array elments");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the Target value");
        int target=s.nextInt();
        System.out.println(flo.firstocc(arr,0,target));
        System.out.println(flo.lastocc(arr,arr.length-1,target));
    }
}
