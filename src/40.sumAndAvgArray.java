class sumAndAvgArray
{
    public static void main(String[] args) {
        System.out.println("Welcome the sum and avg program..");

        int[]myarray=ArrayDec.inputArray();

       long sumaArray=arraysum(myarray);
        System.out.println("sum of array : "+sumaArray);
        double Avg=arrayAvg(myarray);
        System.out.println("Average of array is : "+Avg);


    }

    public static long arraysum(int[]myArray)
    {
        long sum=0;
        int i=0;
        while(i<myArray.length)
        {
            sum=myArray[i]+sum;
            i++;
        }
        return sum;
    }

    public static double arrayAvg(int[] myArray)
    {
       long sum=arraysum(myArray);
        return (sum/myArray.length);
    }
}
