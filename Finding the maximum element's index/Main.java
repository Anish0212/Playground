import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    int max;
    for(int i=0;i<n;i++) {
    list[i] = in.nextInt();
    }
    if(list[0]>list[1]) {
    max = 0;
    }
    else {
    max = 1;
    }
 for(int id=1;id<n;id++) {
    if(list[max]<list[id]) {
    max = id;
    }
 }
System.out.println(max);     
  }
}