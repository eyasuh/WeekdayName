import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        //Scanner object
        Scanner in = new Scanner(System.in);
        //prompt user for weekday number
        System.out.print("Enter the weekday number: ");
        int weekNum = in.nextInt();
        // simple if else if statement to print weekday according to the number put in
        if (weekNum == 1) System.out.println("It is Sunday.");
        else if (weekNum == 2) System.out. println("It is Monday");
        else if (weekNum == 3) System.out. println("It is Tuesday.");
        else if (weekNum == 4) System.out. println("It is Wednesday.");
        else if (weekNum == 5) System.out. println("It is Thursday.");
        else if (weekNum == 6) System.out. println("It is Friday.");
        else System.out. println("It is Saturday.");
    }
}
