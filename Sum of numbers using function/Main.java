import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sum(n));
      
	}
  public static int sum(int m )
  {
    int result=0;
    for(int i=1; i <=m; i++)
    {
       result = result + i ;
     
    }
    return result;
    
  }
  
 }