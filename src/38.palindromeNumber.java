import java.util.Scanner;

class palindromeNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();

        boolean checkNumber=isPalindrome(num);
        if(checkNumber)
        {
            System.out.println("Your number is palindrome..:");
        }
        else
        {
            System.out.println("Your number is not palindrome..");
        }

    }

    public static boolean isPalindrome(int num)
    {
        return num==reverse(num);
    }

    public static int reverse(int num)
    {
        int newNum=0;

        while(num>0)
        {
            int digit=num%10;
            newNum=newNum*10+digit;
            num=num/10;
        }
        return newNum;
    }

}
