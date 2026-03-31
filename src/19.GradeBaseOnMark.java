import java.util.Scanner;

class GradeBaseOnMark
 {
     public static void main(String[] args) {
         System.out.println("Welcome to the program to find the grade based on mark..");
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the mark :");
         int mark=sc.nextInt();

         if(mark>=90)
         {
             System.out.println("Grade is A");
         } else if (mark>=75)
         {
             System.out.println("Grade is B");
         } else if (mark>=60) 
         {
             System.out.println("Grade is C");   
         } else if (mark>30)
         {
             System.out.println("Grade is D");
         }
         else
         {
             System.out.println("Grade is E");
         }
     }
}
