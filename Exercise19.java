
import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {
        System.out.println(sumOfNumbers());

    }

    public static String sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a challenge where you will enter numbers and we calculate the sum");
        System.out.println("Are you ready (Yes/ No) ? ");
        String response = scanner.nextLine();

        if (!response.equalsIgnoreCase("yes")) {
            scanner.close();
            return "Thank you. Operation closing";
        }

        int sum = 0;
        boolean isCalculater = false;
        int count = 1;
        int range = 0;
        do {
            while (count <= 5) {
                System.out.println("Enter number #" + count);
                System.out.println("Please enter a valid number between " + range + " and " + Integer.MAX_VALUE);
                try {
                    String numInput = scanner.nextLine();
                    int input = validateNumInput(range, numInput);
                    if (input == -1) {
                        continue;
                    }
                    sum = sum + input;
                    count++;

                    isCalculater = count != 6 ? false : true;
                } catch (NumberFormatException badUserInput) {
                    System.out.println("Please enter a valid number");
                }

            }
        } while (!isCalculater);

        scanner.close();

        return "Sum of five numbers is " + sum;
    }

    public static int validateNumInput(int range, String input) {
        int number = Integer.parseInt(input);
        int validNum = range + Integer.MAX_VALUE;

        if (number < 0 || number > validNum) {
            System.out.println("Invalid Num");
            return -1;
        }
        return number;
    }

}
