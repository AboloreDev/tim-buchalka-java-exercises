
public class Exercise15 {

    public static void main(String[] args) {
        boolean result = isPerfectNumber(0);
        System.out.println(result);
    }

    public static void printFactors(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int greatestDivisor = 1;

        for (int i = 1; i <= Math.min(first, second); i++) {
            if (first % i == 0 && second % i == 0) {
                greatestDivisor = i;
            }
        }

        System.out.println(greatestDivisor);

        return greatestDivisor;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;
        int originalNumber = number;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        return originalNumber == sum;
    }

}
