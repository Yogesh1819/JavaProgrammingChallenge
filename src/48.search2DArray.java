import java.util.Scanner;

class search2DArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][]newArray=ArrayDec.input2DArray();
        System.out.print("Enter the number you want to search : ");
        int num=sc.nextInt();
        boolean isFound=serachArray(newArray,num);
        if(isFound)
        {
            System.out.println("Your number is found in array");
        }
        else
        {
            System.out.println("Your number is not found in array");
        }

    }

    public static boolean serachArray(int[][] newArray,int num)
    {
        int i=0;
        while(i<newArray.length)
        {
            int j=0;
            while (j<newArray[i].length)
            {
                if(newArray[i][j]==num)
                {
                    return true;
                }
                j++;

            }
            i++;

        }
        return false;
    }
}
