import java.util.Scanner;

class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        System.out.println("Here is your fibonacci series : ");
        fibonaciSeries(num);

    }

    public static void fibonaciSeries(int num)
    {
        if(num<0) return;
        System.out.println("Intial first number : 0");
        if(num==0) return;
        System.out.println("Intial second number : 1");

        int first=0, second=1;

        while(first+second<=num)
        {
            int third=first+second;
            System.out.print(third +" ");
            first=second;
            second=third;

        }

    }
}
