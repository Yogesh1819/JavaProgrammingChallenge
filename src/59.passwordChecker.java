import java.util.Scanner;

class passwordChecker
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your password : ");
        String pwd=sc.next();

        do{
            System.out.println("Please enter your password : ");
            pwd=sc.next();
        }while (!passwordValid(pwd));
        System.out.println("Thanks for entering valid password");
       }

       public static boolean passwordValid(String pwd)
       {
           return pwd.length()>6;
       }
}
