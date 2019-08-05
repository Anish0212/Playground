import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    char ch = in.next().charAt(0);
    int key = in.nextInt();
    if(ch >= 'a' && ch <= 'z'){
      int offset = ch + 26;
      ch = (char)(offset - key);
    }
    else if(ch >= 'A' && ch <= 'Z'){
      
        ch = (char)(ch - key );
    }
    System.out.print(ch);
  }
}
