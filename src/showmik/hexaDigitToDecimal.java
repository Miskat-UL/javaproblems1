package showmik;
import java.util.Scanner;

public class hexaDigitToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter HEX digit: ");
        String hex = input.nextLine();

        if(hex.length() != 1){
            System.out.println("You must enter exactly one Character!");
            System.exit(1);
        }

        char ch =  hex.charAt(0);
        if(ch>= 'A' && ch<='F'){
            int value  = ch -'A' +10;
            System.out.println("Decimal code for the hex digit "+ ch+ " is "+ value);
        }
        else if(Character.isDigit(ch)){
            System.out.println("Decimal code for the hex digit "+ ch+ " is "+ ch);
        }
        else{
            System.out.println(ch+ " is a invalid input");
        }
    }

}
