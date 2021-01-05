package showmik;
import java.util.Random;
import java.util.Scanner;

public class additionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);

        System.out.println("What is "+ num1+" + "+ num2+ " ?");
        int answer = input.nextInt();

        System.out.println("your answer is "+(num1+num2 == answer));

    }
}
