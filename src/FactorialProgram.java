import java.util.Scanner;

public class FactorialProgram
{
    public static void main(String[] args) {
        System.out.println("Program for calculate the factorial of given number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int result = calculateFactorial(n);
        System.out.println(result);
    }


        public static int calculateFactorial(int n)
        {
        int factorial = 1;
        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            factorial *= i; // multiply factorial by i
        }
        return factorial;

    }
}
