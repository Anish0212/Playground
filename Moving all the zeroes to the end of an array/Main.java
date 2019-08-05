import java.util.Scanner;
class Main {
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int arr[] = new int[n];
       for(int i =0;i<n;i++) {
         arr[i] = in.nextInt();       
       }
      zero(n,arr);
      for(int i=0;i<n;i++) {
         System.out.print(arr[i]+" ");
      }
    }
    
  public static void zero(int n ,int arr[]) {
      int count=0;
    for(int i=0;i<n;i++) {
      
        if(arr[i]!=0) {
          
           int temp = arr[i];
           arr[i] = arr[count];
           arr[count] = temp;
            count++;
        }
    }
  }
}