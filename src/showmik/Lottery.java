package showmik;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * 20);

        System.out.println("Enter your lottery(TWO DIGITS ONLY!): ");
        int guess = input.nextInt();

        int lotteryNum1 = lottery / 10;
        int lotteryNum2 = lottery % 10;

        int guessNum1 = guess / 10;
        int guessNum2 = guess % 10;


        if(guess == lottery){
            System.out.println("Exact match! , You Win $1000");
        }
        else if(lotteryNum1 == guessNum2 || lotteryNum2 == guessNum1){
            System.out.println("match all digits!  you win $3000");
        }
        else if(lotteryNum1 == guessNum1 || lotteryNum2 == guessNum1 || lotteryNum2 == guessNum2 || lotteryNum2 == guessNum2 ){
            System.out.println("Match one digits: you win $1000");
        }
        else{
            System.out.println("Sorry, No Match");
        }
    }
}
