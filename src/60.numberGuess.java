import java.util.Scanner;

class numberGuess
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=6,guessNumber;

        do{
            System.out.println("Please enter the number for guessing : ");
            guessNumber=sc.nextInt();

        }while(num!=guessNumber);
        System.out.println("You have been guessed the right number ");
    }




}
