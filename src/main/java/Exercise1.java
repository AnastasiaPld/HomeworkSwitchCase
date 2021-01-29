import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of the week:");
        int weekNumber;
        weekNumber= in.nextInt();

        switch (weekNumber) {
            case 1:
                System.out.println("You entered 1. So week days is Monday");
                break;
            case 2:
                System.out.println("You entered 2. So week days is Tuesday");
                break;
            case 3:
                System.out.println("You entered 3. So week days is Wednesday");
                break;
            case 4:
                System.out.println("You entered 4. So week days is Thursday");
                break;
            case 5:
                System.out.println("You entered 5. So week days is Friday");
                break;
            case 6:
                System.out.println("You entered 6. So week days is Saturday");
                break;
            case 7:
                System.out.println("You entered 7. So week days is Sunday");
                break;

            default:
                System.out.println("Invalid data");
                break;
        }

    }
}
