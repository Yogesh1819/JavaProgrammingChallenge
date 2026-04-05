class minAndMaxInArray
{
    public static void main(String[] args) {
        int[] numArray=ArrayDec.inputArray();
        int minNumber=minFromArray(numArray);
        System.out.println("Minium number in array is : "+minNumber);
        int maxNumber=maxNumOfArray(numArray);
        System.out.println("Maximum number in array is : "+maxNumber);

    }

    public static int minFromArray(int[] numArray)
    {
       int min=Integer.MAX_VALUE;
       int i=0;
       while(i<numArray.length)
       {
           if(min>numArray[i])
           {
               min=numArray[i];

           }
           i++;

       }
        return min;
    }

    public static int maxNumOfArray(int[] numArray)
    {
        int max=numArray[0];
        int i=0;
        while(i<numArray.length)
        {
            if(max<numArray[i])
            {
                max=numArray[i];
            }
            i++;

        }
        return max;
    }
}
