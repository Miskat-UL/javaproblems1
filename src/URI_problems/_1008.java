package URI_problems;
import java.util.Scanner;

public class _1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        double A = input.nextDouble();
        double B = input.nextDouble();

        double X = (A+ B*.15);
        System.out.println("NUMBER = "+A);
        System.out.printf("SALARY = U$ %.2f",X);


    }
}
