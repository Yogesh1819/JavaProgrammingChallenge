import java.util.Scanner;

class multiplicationTable {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number :");
         int num=sc.nextInt();

         int i=1;

         while(i<=10)
         {
             int abcd=(num * i);
             i++;
             System.out.println(abcd);
         }
     }
}
