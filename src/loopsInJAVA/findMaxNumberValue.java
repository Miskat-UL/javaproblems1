package loopsInJAVA;
import java.util.Scanner;

public class findMaxNumberValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max, number;

        max = 1;
        int count =  1;

        while (count<=3){
            number = input.nextInt();
            if (number > max){
                max = number;
            }

            count++;
        }

        System.out.println(max+" eh o maior");



    }

}
