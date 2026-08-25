public class Exercise11 {
    
    public static void main(String[] args) {
    //    double amount = 10000.0;
    //    double incrementor = 0.25;

    //        for (double rate = 7.5; rate < 10; rate = rate + incrementor) {
             
    //            double value = calculateInterest(amount, rate);
    //             System.out.println(value);
    //        }
        
       boolean data = isPrime(997);
       System.out.println(data);

       primeCounter();
        
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
}
