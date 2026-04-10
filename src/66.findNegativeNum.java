import java.util.Scanner;

class findNegativeNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while(true)
        {
            System.out.println("Please enter the number ");
            int num=sc.nextInt();
          if(num==0)
          {
              break;
          }
          if(num<0)
          {
              continue;
          }
          sum=sum+num;
        }
        System.out.println("Sum of all positive numbers is : " +sum);

    }
}
