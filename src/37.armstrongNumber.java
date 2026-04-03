import java.util.Scanner;

class armstrongNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();

        int originalNumber=num;

        int sum=0;

        while(num>0)
        {
            int digit=num%10;

            sum=sum+(digit*digit*digit);

            num=num/10;
        }

        if(sum==originalNumber)
        {
            System.out.println("Number is armstrong");
        }
        else
        {
            System.out.println("Number is not armstrong");
        }

    }
}
