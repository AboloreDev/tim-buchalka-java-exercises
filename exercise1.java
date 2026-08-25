public class exercise1 {
    public static void main(String[] args) {
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;

        double sumOfDouble = (firstDouble + secondDouble) * 100d;

        double thirdDouble = 40.00d;
        double divideDouble = sumOfDouble % thirdDouble;

        boolean isRemaining = (divideDouble == 0.0) ? true : false;
   
        if (!isRemaining) {
            System.out.println("got some remainder");
        }


        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        boolean gameOver = true;

        int finalScore = score;

        if (gameOver) {
            finalScore = finalScore + (bonus * levelCompleted);
            System.out.println("finalScore " + finalScore);
        }
    }
}
