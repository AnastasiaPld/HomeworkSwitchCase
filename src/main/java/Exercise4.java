import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num = sc.nextDouble();

        System.out.println("Enter second number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter third number:");
        double num2 = sc.nextDouble();

        if (num > num1 && num1 > num2) {

            System.out.println("The biggest number is: "+ num);
        } else if (num1 > num && num1 > num2) {
            System.out.println("The biggest number is: "+num1);

        } else if (num2 > num && num2 > num1){
            System.out.println("The biggest number is: "+num2);
        }
        else if (num==num1 && num1==num2) {
            System.out.println("All numbers are even.");
        }

    }
}
