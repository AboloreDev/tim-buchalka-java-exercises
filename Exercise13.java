
public class Exercise13 {

    public static void main(String[] args) {
        sumDigits(1);
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        // For loop works but the it takes 5 seconds to return an answer
        // for (int i = number; i > 0; i++) {
        //     int digit = number % 10;
        //     sum = sum + digit;
        //     number = number / 10;
        // }
        System.out.println("Sum of digits is " + sum);
        return sum;
    }
}
