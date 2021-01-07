package loopsInJAVA;
import java.util.Scanner;

public class sentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number (if 0 then it will be executed): ");
        int data = input.nextInt();

        int sum = 0;
        while (data!=0){
            sum += data;
            System.out.println("enter the number (if 0 then it will be executed: ");
            data = input.nextInt();

        }

        System.out.println("the sum is :"+sum);


    }
}
