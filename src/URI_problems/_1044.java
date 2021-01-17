package URI_problems;
import java.util.Scanner;
public class _1044 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        double b = input.nextDouble();

        if(b%a==0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao Sao Multiplos");
        }
    }


}
