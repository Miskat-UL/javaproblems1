package URI_problems;
import java.util.Scanner;

public class _1011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double C = input.nextDouble();

        double result = (4.0/3)*3.14159*Math.pow(C,3);

        System.out.printf("VOLUME = %.3f\n",result);
    }

}
