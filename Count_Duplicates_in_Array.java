class Array{
   public void CountDup(int []arr){
       int c=0;
       for(int i=0;i< arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   System.out.print(arr[i]);
               }
           }
       }
       //return c;

   }

   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       Array a=new Array();
       int n=s.nextInt();
       int[]arr=new int[n];
       for(int i=0;i< arr.length;i++){
           arr[i]=s.nextInt();
       }
       //System.out.println(a.CountDup(arr));
       a.CountDup(arr);
   }
}
