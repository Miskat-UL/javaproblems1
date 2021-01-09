package loopsInJAVA;
import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("multilication Table");

        System.out.println("   ");
        for(int j =1; j<=9; j++){
            System.out.println("    "+j);
        }

        System.out.println("\n ---------------------------------------------------");

        for (int i=1 ; i<=9; i++){
            System.out.print(i+ " | ");
            for (int j=1; j<=9;j++){
                System.out.printf("%4d", i*j);
            }
            System.out.println();
        }


    }
}
