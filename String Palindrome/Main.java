import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int len = str.length();
        int end = len - 1;
        int front = 0;
        boolean palindrome = true;
        while(front < end)
        {
            if(str.charAt(front) != str.charAt(end))
            {
                palindrome = false;
                break;
            }
            front++;
            end--;
        }
        if(palindrome == true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    } 
}