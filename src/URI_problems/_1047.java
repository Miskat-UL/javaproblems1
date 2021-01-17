package URI_problems;
import java.util.Scanner;

public class _1047 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h1 = input.nextInt();
        int m1 = input.nextInt();
        int h2 = input.nextInt();
        int m2 = input.nextInt();



        int remainingH = h2 -h1;
        int remainingM = m2 - m1;




       if(remainingH<0){
           remainingH = 24+remainingH;
        }

        else if(remainingM<0){
           remainingM = 60+remainingM;
            remainingH--;
        }
        if(h1==h2 && m1==m2){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else{
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",remainingH,remainingM);
        }

    }
}
