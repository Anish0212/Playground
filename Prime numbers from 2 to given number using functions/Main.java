import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       for(int i=2;i<=n;i++)
       {
         if(prime(i))
         {
           System.out.println(i);
         }
       }      
	}
  public static boolean prime(int m )
  {
    boolean primeno= true;
    for(int num=2; num<= m /2; num++)
    {
      if(m%num == 0)
      {
        primeno=false;
        break;
      }
    }
    return primeno;
  }
  
  
}