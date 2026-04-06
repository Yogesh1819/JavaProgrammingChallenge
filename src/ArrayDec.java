import java.util.Scanner;

public class ArrayDec
{
    public static void main(String[] args) {

    }

    public static int[] inputArray()
    {  Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element no : ");
        int size=sc.nextInt();
        int [] nums=new int[size];

        int i=0;
        while(i<nums.length)
        {
            System.out.print("Please enter the element value " + (i+1)+ " :");
            nums[i]=sc.nextInt();
            i++;
        }
        return nums;

    }

    public static void displayArray(int[] numArray)
    {
        int i=0;
        while (i<numArray.length)
        {
            System.out.print(numArray[i]+" ");
            i++;

        }
        System.out.println();

    }

    public static void display2DArray(int[][]newArray)
    {
      int i=0;
      while (i<newArray.length)
      {
          int j=0;
          while (j<newArray[i].length)
          {
              System.out.print(newArray[i][j]+" ");
              j++;
          }
          System.out.println();
          i++;
      }

    }


    public static int[][] input2DArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows :");
        int rows = sc.nextInt();
        System.out.print("Enter no of coloumn :");
        int coloumn=sc.nextInt();

        int [][] newArray=new int[rows][coloumn];

        int i=0;
        while(i<newArray.length)
        {
          int j=0;
          while(j<newArray[i].length)
          {
              System.out.print("Enter element at row :"+(i+1)+ ",column "+(j+1)+ " :");
              newArray[i][j]=sc.nextInt();
               j++;
          }
          i++;
        }
        return newArray;

    }
}
