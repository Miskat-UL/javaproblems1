package loopsInJAVA;
import java.util.Scanner;

public class subtractionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        int numberOfQuiz = 5;
        int correctCount = 0;
        int count = 0;
        String output = "";


        while (count < numberOfQuiz){
            int number1 = (int)(Math.random() * 100);
            int number2 = (int)(Math.random() * 100);

            if(number1<number2){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.println("what is "+number1+"-"+ number2+ "?");
            int answer = input.nextInt();

            if(number1-number2 ==answer){
                System.out.println("your are correct! ");
                correctCount++;

            }else{
                int sub = number1-number2;
                System.out.println("wrong answer! the answer should be "+ sub);
            }
            count++;

            output +="\n"+ number1 + " - " + number2+ " = " + answer + ((number1-number2 ==answer)? " correct": " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("correct count is "+ correctCount+ "\n"+ output + "\n"+ "time taken: "+(testTime/1000) +" seconds");
    }
}
