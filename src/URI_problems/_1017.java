package URI_problems;
import java.util.Scanner;

public class _1017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        double result =(float)(a*b)/12;

        System.out.printf("%.3f", result);

    }
}
