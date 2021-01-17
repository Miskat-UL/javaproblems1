package URI_problems;
import java.util.Scanner;
public class _1043 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if((a<(b+c)) && (b<(a+c)) && (c<(a+b))){
            double result = a +b+c;
            System.out.printf("Perimetro = %1f\n",result);
        }
        else {
            double result = ((a+b)*c)/2;
            System.out.printf("Area = %.1f\n", result);
        }


    }
}
