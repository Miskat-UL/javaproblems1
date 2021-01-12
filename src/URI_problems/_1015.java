package URI_problems;
import java.util.Scanner;

public class _1015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double C = input.nextDouble();
        double B = input.nextDouble();
        double D = input.nextDouble();

        double result =Math.sqrt((Math.pow((B-A),2))+((Math.pow((D-C),2))));
        System.out.printf("%.4f", result);
    }
}
