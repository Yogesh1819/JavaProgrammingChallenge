import java.util.Scanner;

class EvenOdd
 {
     public static void main(String[] args) {

         System.out.println("The program is to find number is even or odd..");

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number : ");
         int number=sc.nextInt();

         if(number%2==0)
         {
             System.out.println("Number is even..");
         }
         else
         {
             System.out.println("Number is odd..");
         }
     }
}
