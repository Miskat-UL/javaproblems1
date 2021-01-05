package loopsInJAVA;
import java.util.Scanner;

public class simpleQuizGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int)(Math.random() *10);
        int number2 = (int)(Math.random() *10);

        System.out.println("what is "+ number1+ " + "+ number2+"?");

        int answer = input.nextInt();

        while(number1+number2 != answer){
            System.out.println("wrong answer! try again. What is "+ number1+ " + "+ number2+"?");
            answer = input.nextInt();
        }

        System.out.println("you are right! ");



    }

}
