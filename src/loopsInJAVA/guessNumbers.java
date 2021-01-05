package loopsInJAVA;
import java.util.Scanner;

public class guessNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int)(Math.random() * 100);

        System.out.println("Guess the number between 0 to 100..");
        int guess = -1;

        while(guess != number){
            System.out.println("enter your guess: ");
            guess = input.nextInt();

            if (guess == number){
                System.out.println("yes! your guessed number is "+ number);

            }else if(guess> number){
                System.out.println("your number is too high");

            }else{
                System.out.println("your number is too low!");
            }
        }

    }


}
