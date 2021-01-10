package URI_problems;
import java.util.Scanner;

public class _1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double X = ((A/10.0)*2) + ((B/10.0)*3)+ ((C/10.0)*5);
        System.out.printf("MEDIA = %.1f\n ",X);

    }
}
