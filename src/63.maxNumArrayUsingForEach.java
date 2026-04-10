class maxNumArrayUsingForEach
{
    public static void main(String[] args) {
        int[] numArray={10,20,12,4,54,22};
         int max=numArray[0];
        for(int array:numArray)
        {
            if(array>max)
            {
                max=array;
            }
        }
        System.out.println("Here is your maximum number from array : "+max);
    }
}
