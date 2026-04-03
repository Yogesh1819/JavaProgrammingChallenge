import java.util.Scanner;

class startPatternProgram
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int rows=sc.nextInt();
        System.out.println("Here is your right hand star pattern ");
        rightHandPattern(rows);
        System.out.println("Here is your reverse right hand star pattern ");
        reverseRightHandPattern(rows);
    }


    public static void reverseRightHandPattern(int maxRows)
    {
       int rows=maxRows;

       while(rows>0)
       {
           int i=0;
           while(i<rows)
           {
               System.out.print(" *");
               i++;
           }
           System.out.println();
           rows--;

       }
    }


    public static void rightHandPattern(int maxRows)
    {
        int rows=0;
        while(rows<maxRows)
        {
            System.out.print("*");
            int i=0;
            while(i<rows)
            {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
