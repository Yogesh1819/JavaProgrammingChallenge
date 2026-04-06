class sumAndAvg2DArray
{
    public static void main(String[] args)
    {
        int[][] newArray=ArrayDec.input2DArray();
        long sumOfArray=sumOf2DArray(newArray);
        System.out.println(sumOfArray);
        double avgOfArray=avgOf2DArray(newArray);
        System.out.println(avgOfArray);

    }

    public static double avgOf2DArray(int[][] newArray)
    {
       double sum=sumOf2DArray(newArray);
       int totalElement=newArray.length*newArray[0].length;
       return (sum/totalElement);
    }

    public static long sumOf2DArray(int[][]newArray)
    {
        int sum=0;
        int i=0;
        while (i<newArray.length)
        {
            int j=0;
            while (j<newArray[i].length)
            {
                sum=newArray[i][j]+sum;
                j++;

            }
            i++;

        }
        return sum;
    }
}
