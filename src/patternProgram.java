import java.util.Scanner;

public class patternProgram
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number or rows : ");
        int rows = sc.nextInt();
        System.out.println("Right hand star program..");
       firtsPattern(rows);
        System.out.println("Reverse right hand star program..");
       reverseRightHand(rows);
        System.out.println("Left half star program..");
        leftHalfPattern(rows);
    }



public static void leftHalfPattern(int maxRows)
{
    int rows=maxRows;
    while(rows>0)
    {
        int j=0;
        while(j<rows-1)
        {
            System.out.print("  ");
            j++;
        }

      int i=0;
      while(i<=(maxRows-rows))
      {
          System.out.print("* ");
          i++;
      }
        System.out.println();
        rows--;

    }

}

    public static void reverseRightHand(int maxRows)
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
    public static void firtsPattern(int maxRows)
    {
      int rows=0;
      while(rows<maxRows)
      {
          System.out.print("*");
          int i=0;
          while (i<rows)
          {
              System.out.print(" *");
              i++;
          }
          System.out.println();
          rows++;
      }


    }


}
