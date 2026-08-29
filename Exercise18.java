
import java.time.LocalDate;
import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();

        // System.out.println(inputFromConsole(currentYear));
        System.out.println(inputFromScanner(currentYear));
    }

    public static String inputFromConsole(int currentYear) {
        System.out.println(currentYear);

        String name = System.console().readLine("Good Morning what's your name? ");
        System.out.println("Welcome, " + name + ". Thank you for contacting us");

        String ageInput = System.console().readLine("What year where you born ? ");
        int ageToInt = (currentYear - Integer.parseInt(ageInput));

        return "You are " + ageToInt + "years old.";

    }

    public static String inputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Good Morning, what is your name");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + ".thank you for contactimg us!");
        System.out.println("What year were you born? ");

        boolean isValidAge = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth between " + (currentYear - 125) + "and " + currentYear);
            try {
                age = checkData(currentYear, scanner.nextLine());
                isValidAge = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Character not allowed!!!!");
            }
        } while (!isValidAge);

        scanner.close();
        return "You are " + age + "years old.";

    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int validYear = currentYear - 125;

        if (dob < validYear || dob > currentYear) {
            System.out.println("Invalid date of birth");
            return -1;
        }

        return (currentYear - dob);
    }
}
