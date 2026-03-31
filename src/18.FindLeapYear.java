import java.util.Scanner;

class FindLeapYear
 {
     public static void main(String[] args) {
         System.out.println("Welcome to the program to find year is leap or not..");
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the year :");
         int Year=sc.nextInt();

         if((Year%4==0 && Year%100!=0) || Year%400==0 )
         {
             System.out.println("Year is leap");
         }
         else
         {
             System.out.println("Year is not leap year");
         }
     }
}
