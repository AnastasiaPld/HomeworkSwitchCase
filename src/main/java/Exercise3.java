import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        double number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = sc.nextDouble();

        if ( number <0) {
            System.out.println("Negative number");
        }
        else if ( number >0)
            System.out.println("Positive number");


    }
}
