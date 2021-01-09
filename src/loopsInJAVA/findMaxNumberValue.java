package loopsInJAVA;
import java.util.Scanner;

public class findMaxNumberValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max, number;
        number  = input.nextInt();
        max = 0;

        while (number!=0){
            if (number > max){
                max = number;
            }
            number = input.nextInt();
        }

        System.out.println("max is "+max);
        System.out.println("number is "+number);


    }

}
