package showmik;
import java.util.Scanner;


public class swapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int number1 = (int)(Math.random() * 10);
//        int number2 = (int)(Math.random() * 10);

        System.out.println("enter first number:");
        int number1 = input.nextInt();
        System.out.println("enter second number:");
        int number2 = input.nextInt();

        if(number1>number2){
            int temp = number1;
            number1 = number2;
            number2=temp;
            System.out.println("after swaping: "+number1+" "+ number2);
        }
        else{
            int number3 = number1+number2;
            System.out.println("sum of numbers "+ number3);
        }


    }
}
