package showmik;
import java.util.Scanner;

public class integerSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a number between 0 and 1000: ");
        int num = input.nextInt();
        int a = num % 10;
        int b = num / 10;
        int c =  b % 10;
        int d = b / 10;
        int e = d % 10;

        int sum = a + c + e;

        System.out.println("the sum of the digit is : "+sum);

    }
}
