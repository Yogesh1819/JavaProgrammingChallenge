class palindromeArray
{
    public static void main(String[] args) {
        int[] numArray=ArrayDec.inputArray();

        boolean palindrome=isPalindrome(numArray);
        if(palindrome)
        {
            System.out.println("Your array is palindrome");
        }
        else
        {
            System.out.println("Your array is not palindrome");
        }
    }

    public static boolean isPalindrome(int[] numArray)
    {
        int i=0;
        while (i<numArray.length/2)
        {
         if(numArray[i]!=numArray[numArray.length-1-i])
         {
             return false;
         }
         i++;
        }
        return true;
    }
}
