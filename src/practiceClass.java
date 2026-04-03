import java.util.Scanner;

public class practiceClass
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        System.out.println("Here is your fibonacci series : ");
        fibonacciSeries(num);
    }

    public static void fibonacciSeries(int num)
    {
       int i=2;

       int first=0;
       int second=1;

       while(i<=num)
       {
           int third=first+second;
           System.out.println(third + " ");
           first=second;
           second=third;
           i++;
       }
    }
}
