
public class Exercise12 {

    public static void main(String[] args) {
        int number = 5;
        boolean result = isEvenNumber(number);
        System.out.println(result);

        do {
            if (number > 30) {
                break;
            }
            System.err.println(number);
            number++;
            result = (number > 6);
        } while (result);

        while (true) {
            if (number <= 20) {
                number++;
                boolean isEven = isEvenNumber(number);

                if (number > 20) {
                    break;
                }

                if (isEven) {
                    System.out.print(number + "_");
                }
            }
        }

    }

    public boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }

        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (end < start) {
            return -1;
        }

        if (start < 0 || end < 0) {
            return -1;
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {

            if (isOdd(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static boolean isEvenNumber(int number) {
        if (number < 0) {
            return false;
        }

        return number % 2 == 0;
    }
}
