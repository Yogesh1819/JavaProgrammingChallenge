class reverseArray
{
    public static void main(String[] args) {
    int[] numArray=ArrayDec.inputArray();
    revArray(numArray);
    ArrayDec.displayArray(numArray);

    }

    public static void revArray(int[] arr)
    {
      int i=0;
      while (i<arr.length/2)
      {
          int swap=arr[i];
          arr[i]=arr[(arr.length-1)-i];
          arr[(arr.length-1)-i]=swap;
          i++;

      }

    }


}
