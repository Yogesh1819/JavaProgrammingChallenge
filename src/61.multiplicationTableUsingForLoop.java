import java.util.Scanner;

class multiplicationTableUsingForLoop
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int num=sc.nextInt();

        for(int i=01;i<=10;i++)
        {
         //   num=(num*i);
         //   System.out.println(num +" x "+i+"="+(num*i));
            System.out.println("Your multiplication table is here : "+(num*i));
        }
    }
}
