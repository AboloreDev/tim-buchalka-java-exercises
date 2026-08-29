
public class Exercise16 {

    public static void main(String[] args) {
        numberToWords(1000);
        // System.out.println(count);
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    public static int reverse(int number) {
        int rev = 0;

        while (number != 0) {
            int digit = number % 10;
            rev = digit + (rev * 10);
            number = number / 10;
        }
        return rev;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int digitCount = getDigitCount(number);
        int reversedNum = reverse(number);

        for (int i = 0; i < digitCount; i++) {
            int digit = reversedNum % 10;
            reversedNum = reversedNum / 10;

            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid digit");
                    break;
            }
        }
    }
}
