class findArraySortedOrNot
{
    public static void main(String[] args) {
        int[] numArray=ArrayDec.inputArray();
        boolean arrayIncrease=isIncreasing(numArray);
        boolean arrayDecrease=isDecreasing(numArray);
        if(arrayIncrease || arrayDecrease)
        {
            System.out.println("Array is sorted..");
        }
        else
        {
            System.out.println("Array is not sorted..");
        }

    }

    public static boolean isIncreasing(int[] numArray)
    {
        int i=1;
        while(i<numArray.length)
        {
           if(numArray[i]<numArray[i-1])
           {
               return false;
           }
           i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] numArray)
    {
        int i=1;
        while(i<numArray.length)
        {
            if(numArray[i]>numArray[i-1])
            {
                return false;
            }
          i++;
        }
        return true;
    }
}
