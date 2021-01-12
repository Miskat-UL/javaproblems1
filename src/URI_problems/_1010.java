package URI_problems;
import java.util.Scanner;

public class _1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


       
        int B = input.nextInt();
        double C = input.nextDouble();
        double result = B*C;


        B = input.nextInt();
        C = input.nextDouble();

        result=result+(B*C);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",result);


    }
}
