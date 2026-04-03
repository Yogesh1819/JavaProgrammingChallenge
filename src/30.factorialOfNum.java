import java.util.Scanner;

class factorialOfNum
 {
     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.print("Enter the num :");
         int num=sc.nextInt();

         int i=1;
         int fact=1;

         while(i<=num)
         {
             fact=fact*i;
             i++;

         }
         System.out.println("factorial of given number is :" + fact);

     }
}
