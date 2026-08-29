
public class Exercise17 {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(7));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int sumOfBigCount = (bigCount * 5);
        int sumOfSmallCount = (smallCount * 1);
        int sumOfBothCount = (sumOfBigCount + sumOfSmallCount);
        int isRemaining = (goal % 5);

        if (sumOfSmallCount >= goal) {
            return true;
        } else if (sumOfBigCount == goal) {
            return true;
        } else if (sumOfBigCount > goal && sumOfSmallCount == 0) {
            return false;
        } else if (sumOfBothCount >= goal && sumOfSmallCount >= isRemaining) {
            return true;
        } else {
            return false;
        }
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrime = 1;

        for (int i = 2; i <= number; i++) {

            if (number % i == 0) {

                boolean isPrime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }
}
