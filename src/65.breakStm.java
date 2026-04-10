import java.util.Scanner;

class breakStm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("Please enter the text : ");
            String abc=sc.next();
            if(abc.equalsIgnoreCase("Yogesh"))
            {
                System.out.println("Loop is ended..");
                break;
            }
            System.out.println("You entered : "+abc);
        }

    }
}
