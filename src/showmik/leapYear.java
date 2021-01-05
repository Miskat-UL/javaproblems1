package showmik;
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the year: ");
        int leapYear = input.nextInt();

        if(leapYear % 4 == 0 && leapYear % 100 != 0){
            System.out.println(leapYear+" is  a leapyear");
        }
        else if(leapYear % 400 == 0){
            System.out.println(leapYear+" is a leapyear");
        }
        else{
            System.out.println("it is not a leapyear");
        }
    }
}
