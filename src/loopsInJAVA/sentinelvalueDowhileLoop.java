package loopsInJAVA;
import java.util.Scanner;
public class sentinelvalueDowhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number if 0 then executed: ");
        int num = input.nextInt();


        int sum = 0;

        do {
            sum+=num;

            System.out.println(" enter the number if 0 then it will be executed: ");
            num =input.nextInt();

        }while(num!=0);

        System.out.println("the sum is "+ sum);
    }
}
