import java.util.Scanner;

class primeNumCheckUsingForLoop
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int num=sc.nextInt();

        boolean isprime=true;

        if(num<1)
        {
            isprime=false;
        }
        else
        {
            for(int i=2;i<num;i++)
            {
                if(num %i==0)
                {
                    isprime=false;
                    break;

                }
            }

        }

        if(isprime)
        {
            System.out.println("Your number is prime number");
        }
        else
        {
            System.out.println("Your number is not a prime number");
        }
    }
}
