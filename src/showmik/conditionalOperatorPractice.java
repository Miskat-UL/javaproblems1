package showmik;
import java.util.Scanner;

public class conditionalOperatorPractice{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number you want: ");
        int a = input.nextInt();
        double b = Math.max(2.5, 3);
        System.out.println((a % 2 == 0)? "number is even" : "number is odd"); //conditional operators
        System.out.println(b);

    }
}
