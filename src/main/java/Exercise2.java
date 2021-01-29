import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        float length, height, area, perimeter;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        length = in.nextFloat();

        System.out.println("Enter height of rectangle:");
        height= in.nextFloat();

        perimeter= 2* (length+height);
        area=length*height;

        System.out.println("Perimeter of rectangle is:"+perimeter);
        System.out.println("Area of rectangle is:"+area);


    }
}
