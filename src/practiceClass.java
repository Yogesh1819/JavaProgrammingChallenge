import java.util.Scanner;

public class practiceClass
{
    public static void main(String[] args)
    {

        /*
        int[] numArray=ArrayDec.inputArray();
        long sum=sumofArray(numArray);
        System.out.println("Sum of array is " + sum);
        double Avg=avgOfArray(numArray);
        System.out.println("AVerage of array is " + Avg);
        */

        int[][]numArray=ArrayDec.input2DArray();
        ArrayDec.display2DArray(numArray);


    }


    public static long sumofArray(int[]numArray)
    {
     int sum=0;
     int i=0;
     while(i<numArray.length)
     {
         sum=numArray[i]+sum;
         i++;
     }

        return sum;
    }

    public static double avgOfArray(int []numArray)
    {
        double Avg=sumofArray(numArray);
        return (Avg/numArray.length);
    }


}
