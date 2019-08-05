import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   Scanner in = new Scanner(System.in);
      int n1= in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.println(gcd_num(n1,n2));
	}
  public static int gcd_num(int n1,int n2)
  {
    int min;
    if(n1<n2)
    {
      min = n1;
    }
    else
    {
      min= n2 ;
    }
    while(min>=1)
    {
      if((n1 % min==0) && (n2 % min==0))
      {
        return min;
      }
      --min;
    }
    return 0;
  }
}