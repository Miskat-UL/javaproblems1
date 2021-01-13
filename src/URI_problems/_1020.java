package URI_problems;
import java.util.Scanner;
public class _1020 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int h = a / 365;
        int ret = a % 365;
        int m = ret / 30;
        ret = ret % 30;


        System.out.printf("%d ano(s)\n",h);
        System.out.printf("%d mes(es)\n",m);
        System.out.printf("%d dia(s)\n",ret);
    }
}
