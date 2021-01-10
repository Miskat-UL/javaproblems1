package URI_problems;
import java.util.Scanner;

public class _1002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n = 3.14159;
        double R = input.nextDouble();

        double A = n*(R*R);

        System.out.printf("A=%.4f\n", A);
    }

}
