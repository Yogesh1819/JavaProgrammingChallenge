import java.util.Scanner;

class OccurencesArray {
    public static void main(String[] args) {
        System.out.println("Program to find the specific number who is present in array in what number of time.");
        Scanner sc = new Scanner(System.in);

        int[] numArray=ArrayDec.inputArray();
        System.out.print("Enter the number you want to find..");
        int num=sc.nextInt();

        int Occurences=noOfOccurences(numArray,num);
        System.out.println("Your element is present in the array is " +Occurences+ " time");

    }
    public static int noOfOccurences(int[] numArray,int num)
    {
        int Occ=0;
        int i=0;
        while(i<numArray.length)
        {
            if(numArray[i]==num)
            {
                Occ++;
            }
            i++;

        }

        return Occ;
    }


}
