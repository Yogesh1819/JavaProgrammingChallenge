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
}
