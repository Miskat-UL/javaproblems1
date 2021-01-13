package URI_problems;
import java.util.Scanner;
public class _1019 {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);

        int a = input.nextInt();
        int h = a/3600;
        int ret = a%3600;
        int m = ret/60;
        ret = ret%60;

        System.out.printf("%d:%d:%d\n",h,m,ret);

    }
}
