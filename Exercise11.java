public class Exercise11 {
    
    public static void main(String[] args) {
    //    double amount = 10000.0;
    //    double incrementor = 0.25;

    //        for (double rate = 7.5; rate < 10; rate = rate + incrementor) {
             
    //            double value = calculateInterest(amount, rate);
    //             System.out.println(value);
    //        }
        
    //    boolean data = isPrime(997);
    //    System.out.println(data);

    //    primeCounter();
       sumOfThreeAndFive();
        
    }

    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100));
    }

    public static boolean isPrime (int wholeNumber) {
        
        for (int i = 2; i < wholeNumber; i++) {
           if (wholeNumber % i == 0) {
               return false;
           }
        }

         return true;
    }

    public static int primeCounter() {
        int counter = 0;

        for (int i = 2; i <= 1000; i++) {
            boolean foundPrime = isPrime(i);
            if (foundPrime) {
                counter++;
                String message = "Found one prime number " + i;
                System.out.println(message);
                if (counter == 3) {
                    break;
                }
            }
        }
        System.out.println("Total Prime number found is " + counter);
        System.out.println("Operation done");
        return counter;
    }

    public static int sumOfThreeAndFive() {
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum = sum + i;
                count++;
                String message = "Found one number " + i;
                System.out.println(message);
                if (count == 5) {
                    break;
                }
            }
        }

        System.out.println("Total sum of numbers divisible by 3 and 5 after 5 loops is " + sum);
        System.out.println("Exiting loop");
        return sum;
    }
}
