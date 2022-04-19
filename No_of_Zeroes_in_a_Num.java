import java.util.Scanner;
class NoOfZero{
  int c=0;
  public int Count(int n){
    if(n!=0){
      if(n%10==0)
        c++;
      Count(n/10);
    }
    return c;
  }
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    NoOfZero nz=new NoOfZero();
    int n=s.nextInt();
    System.out.print(nz.Count(n));
    
