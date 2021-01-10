package URI_problems;
import java.util.Scanner;

public class _1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();

        double X = ((A/11)*3.5) + ((B/11)*7.5);
        System.out.printf("MEDIA = %.5f\n ",X);
//        System.out.printf("A=%.4f\n", A);
        System.out.println();
    }
}
