import java.util.Scanner;

public class BitwiseAnd
 {
     public static void main(String[] args) {

         System.out.println("Bitwise And Program");
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter First Number : ");
         int Fnumber=sc.nextInt();
         System.out.println("Enter Second Number : ");
         int Snumber = sc.nextInt();

         int result=Fnumber & Snumber;
         System.out.println(result);
     }

}
