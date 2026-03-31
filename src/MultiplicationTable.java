import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        int Table=multiplicationTable();
        System.out.println(Table);


    }

    public static int multiplicationTable()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(num + " X " + i + " = " +(num*i));
        }
        return num;

    }
}
