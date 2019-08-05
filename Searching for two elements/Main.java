import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        
      for(int id=0; id < size ; id++)
       {
         arr[id] = in.nextInt();
       }
       int num1 = in.nextInt();
       int num2 = in.nextInt();
      
       int id1 = -1;
       int id2 = -1;
       for(int id=0; id<size; id++)
         {
           if(num1 == arr[id])
            {
               id1= id;
            }
       	   if(num2 == arr[id])
            {
               id2 = id;
            }        
          }
       System.out.println(id1);
       System.out.println(id2);      
    }
}
