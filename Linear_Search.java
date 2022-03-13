import java.util.Scanner;
//TIME COMPLEXITY FOR BEST CASE of Linear Search O(1).
//TIME COMPLEXITY FOR AVG. CASE of Linear Search O(n+1/2).
//TIME COMPLEXITY FOR WORST CASE of Linear Search O(n).
public class Linear_Search{
    public int [] arr;
    public int n;
    public int item;
    Linear_Search(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        this.n=s.nextInt();
        this.arr=new int[n];

    }
    public void input(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
    }
    public void Linearsearch(){
        Scanner S=new Scanner(System.in);
        item=S.nextInt();
        for (int i = 0; i < n; i++) {
            if (item == arr[i]) {
                System.out.println("Search Successful Element found on index no:-"+ i++);
                ++i;
                break;
            } else {
                if (i == arr.length - 1) {
                    System.out.println("Search Unsccessful");
                }
            }

        }
    }
    public static void main(String[] args) {
        Linear_Search LS=new Linear_Search();
        while(true){
            Scanner s=new Scanner(System.in);
            System.out.println("PRESS 1 TO ENTER");
            System.out.println("PRESS 2 TO SEARCH");
            int choice=s.nextInt();
            switch(choice){
                case 1 -> LS.input();
                case 2 -> LS.Linearsearch();
                case 3 -> System.exit(0);
            }
        }


    }
}
