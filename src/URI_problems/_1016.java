package URI_problems;
import java.util.Scanner;

public class _1016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int result = (int)( a/((90/60.0)-(60/60.0)));
        System.out.printf("%d minutos\n", result);
    }

}
