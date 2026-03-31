import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;
import java.util.Scanner;

class PositiveNegativeAndZeroNumber
 {
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number :\n");
         int number=sc.nextInt();
         
         if(number==0)
         {
             System.out.println("number is zero");
         }
         else if(number>=0)
         {
             System.out.println("Number is positive");
         }
         else if(number<=0)
         {
             System.out.println("Number is negative");
         }
     }
}
