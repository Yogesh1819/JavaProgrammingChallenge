import java.util.Scanner;

class deleteFromArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] numArray=ArrayDec.inputArray();
        System.out.print("Enter the number you want to delete : ");
        int numDelete=sc.nextInt();
        int[] newArray=deleteNumber(numArray,numDelete);
        ArrayDec.displayArray(newArray);

    }

    public static int[] deleteNumber(int[] numArray,int numDelete)
    {
        int occ=OccurencesArray.noOfOccurences(numArray,numDelete);
        if(occ==0)
        {
            return numArray;
        }
        int size=numArray.length-occ;
        int[] newArray=new int[size];
        int i=0, j=0;
        while(i<numArray.length)
        {
            if(numArray[i] !=numDelete)
            {
             newArray[j]=numArray[i];
             j++;
            }
            i++;
        }

        return newArray;
    }
}
