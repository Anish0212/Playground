import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int exponent = in.nextInt();
        int count = 0;
        int result = 1;
        while(count < exponent) {
            result = result * base ;
            count++;
        }
      System.out.println(result);
    }
}