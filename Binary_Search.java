import java.util.Arrays;
import java.util.Scanner;

class Binary_Search {
    int binarySearch(int[] arr, int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Binary_Search ob = new Binary_Search();
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int []arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=S.nextInt();
        }
        int x=S.nextInt();
        int res=ob.binarySearch(arr,0,n-1,x);
        if(res==-1){
            System.out.println("Element found"+" ");
        }
        else{
            System.out.println("Element Not Found"+" ");
        }

    }
}

