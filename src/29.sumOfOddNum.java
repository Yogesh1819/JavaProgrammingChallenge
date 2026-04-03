import java.util.Scanner;

class sumOfOddNum
 {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the num :");
         int num=sc.nextInt();

         int i=1;
         int sum=0;

         while(i<=num)
         {
             if(i%2!=0)
             {
                 sum=sum+i;

             }
             i++;
         }
         System.out.println("sum of all odd number from 1 to " +num+ " is " + sum);


     }
}
