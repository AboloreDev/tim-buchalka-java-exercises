
public class Exercise14 {

    public static void main(String[] args) {
        // int number = 123456789;
        // isPalindrome(number);
        // getEvenDigitSum(number);

        boolean result = isValid(1051);
        System.out.println(result);
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reverse = digit + (reverse * 10);
            originalNumber = originalNumber / 10;
            System.out.println(reverse);

            if (originalNumber == 0) {
                break;
            }
        }

        if (number == reverse) {
            System.out.println("The " + number + " is a palindrome number " + reverse);
            return true;
        } else {
            System.out.println("The " + number + " is not a palindrome number " + reverse);
            return false;
        }
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            int firstDigit = number;

            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            sum = lastDigit + firstDigit;

            break;
        }

        return sum;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum = sum + digit;
            }
            number = number / 10;

        }

        return sum;
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        int startRange = 10;
        int endRange = 99;

        if (number1 < startRange || number2 < startRange || number1 > endRange || number2 > endRange) {
            return false;
        }

        int originalNumber2 = number2;

        while (number1 > 0) {
            int num1Digit = number1 % 10;
            number1 /= 10;

            number2 = originalNumber2;

            while (number2 > 0) {
                int num2Digit = number2 % 10;
                number2 /= 10;

                if (num1Digit == num2Digit) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

        int startRange = 10;
        int endRange = 1000;

        if (number1 < startRange || number1 > endRange
                || number2 < startRange || number2 > endRange
                || number3 < startRange || number3 > endRange) {
            return false;
        }

        int lastDigit1 = number1 % 10;
        int lastDigit2 = number2 % 10;
        int lastDigit3 = number3 % 10;

        return lastDigit1 == lastDigit2
                || lastDigit1 == lastDigit3
                || lastDigit2 == lastDigit3;
    }

    public static boolean isValid(int number) {
        int startRange = 10;
        int endRange = 1000;

        if (number < startRange || number > endRange) {
            return false;
        }

        boolean isValid = (number >= startRange && number <= endRange);

        return isValid;
    }
}
