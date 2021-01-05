package showmik;
import java.util.Scanner;

public class poundToKilo {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double kilogram = pounds * .454;

        System.out.println(pounds+" pound is "+ kilogram+ " kilograms");

        System.out.println("thanks for using our software. Have a nice day");



    }
}
