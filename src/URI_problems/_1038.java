package URI_problems;
import java.util.Scanner;
public class _1038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int x = input.nextInt();
        int y = input.nextInt();

        if(x==1){
            float result = (float) 4.00*y;
            System.out.println(result);
        }
        else if(x==2){
            float result = (float) 4.50*y;
            System.out.printf("Total: R$ %.2f\n",result);
        }
        else if(x==3){
            float result = (float) 5.00*y;
            System.out.printf("Total: R$ %.2f\n",result);
        }
        else if(x==4){
            float result = (float) 2.00*y;
            System.out.printf("Total: R$ %.2f\n",result);
        }
        else if(x==5){
            float result = (float) 1.50*y;
            System.out.printf("Total: R$ %.2f\n",result);
        }

    }
}
