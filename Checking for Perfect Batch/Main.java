import java.util.Scanner;
class Main
{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i = 0;i<n;i++) {
    list[i] = in.nextInt();
    }
    perfect_batch(list,n);
  }
  public static void perfect_batch(int list[],int n ) {
   boolean perfect=true;
    int sum= list[0]+ list[1] + list[2] ;
     for(int id=3;id<n ;id=id+3)  {
     int curr_sum = list[id] + list[id+1] + list[id + 2];
       if(curr_sum!= sum) {
       perfect = false;
       }
     }
    if(perfect==true) {
      System.out.println("Perfect Batch");
    }
    else {
    System.out.println("Not a Perfect Batch");
    }
  }
}