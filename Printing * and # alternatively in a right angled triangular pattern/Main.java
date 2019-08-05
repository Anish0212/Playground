import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  	    int n = in.nextInt();
        int num=0;
        for(int row = 1; row<=n; row++)
        {
          for(int col=1 ; col<= row ; col++)
          {
            if(num==0)
            {
              System.out.print("*");
              num=1;
            }
            else
            {
              System.out.print("#");
              num=0;
            }
             
          }
          System.out.print("\n");
        }
    }
}