package URI_problems;
import java.util.Scanner;

public class _1046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startTime = input.nextInt();
        int endTime = input.nextInt();

        int remainingTime = endTime - startTime;


        if (remainingTime<0){
            int gameLasted = 24+remainingTime;
            System.out.printf("O JOGO DUROU %d HORA(S)\n",gameLasted);
        }
        else if (endTime==startTime){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else{
            System.out.printf("O JOGO DUROU %d HORA(S)\n", remainingTime);
        }
    }
}
