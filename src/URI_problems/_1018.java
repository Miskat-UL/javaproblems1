package URI_problems;
import java.util.Scanner;

public class _1018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int b = a/100;
        int c = a%100;
        int d =  c/50;
        int e = c%50;
        int f = e/20;
        int g = e%20;
        int h = g/10;
        int i = g%10;
        int j = i/5;
        int k = i%5;
        int l = k/2;
        int m = k%2;
        int n = m/1;

        System.out.println(a);

        System.out.println(b+" nota(s) de R$ 100,00");
        System.out.println(d+" nota(s) de R$ 50,00");
        System.out.println(f+" nota(s) de R$ 20,00");
        System.out.println(h+" nota(s) de R$ 10,00");
        System.out.println(j+" nota(s) de R$ 5,00");
        System.out.println(l+" nota(s) de R$ 2,00");
        System.out.println(n+" nota(s) de R$ 1,00");


    }
}
