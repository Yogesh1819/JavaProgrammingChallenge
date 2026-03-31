import java.util.Scanner;

class GreatestOfThreeNumber
 {
     public static void main(String[] args) {
         System.out.println("Welcome to the program to find the greatest number in between three..");

         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the first number :");
         int First=sc.nextInt();
         System.out.print("Enter the second number :");
         int Second=sc.nextInt();
         System.out.print("Enter the third number :");
         int Third=sc.nextInt();

         if(First>=Second && First>=Third)
         {
             System.out.println("First number is a greatest number..");
         } else if (Second>=First && Second>=Third)
         {
             System.out.println("Second number is a greatest number..");
         } else if (Third>=First && Third>=Second)
         {
             System.out.println("Third number is a greatest number..");
         }
     }
}
