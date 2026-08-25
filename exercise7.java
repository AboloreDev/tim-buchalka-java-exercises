public class exercise7 {
    public static void main(String[] args) {
        int h1 = 9;
        int h2 = 99;
        int h3 = 19;

       boolean data = hasTeen(h1, h2, h3);
       System.out.println(data);

       boolean data2 = isTeen(h1);
       System.out.println(data2);
    }
    
    public static boolean areEqualByThreeDecimalPlaces (double p1, double p2) {

        int p1Int = (int) (p1 * 1000);
       
        int p2Int = (int) (p2 * 1000);

        return p1Int == p2Int;
    }


    public static boolean hasEqualSum(int h1,int h2,int h3) {
        int sum = h1 + h2;

        return sum == h3;
    }

    public static boolean hasTeen(int h1,int h2,int h3) {
       int startRange = 13;
       int endRange = 19;

        boolean inH1Range = (h1 >= startRange && h1 <= endRange);
        boolean inH2Range = (h2 >= startRange && h2 <= endRange);
        boolean inH3Range = (h3 >= startRange && h3 <= endRange);

        boolean isInRange = inH1Range || inH2Range || inH3Range;

    //    if (h1 >= startRange && h1 <= endRange) {
    //         return true;
    //    } else if ((h2 >= startRange && h2 <= endRange)) {
    //     return true;
    //    } else if (h3 >= startRange && h3 <= endRange) {
    //     return true;
    //    } else {
    //     return false;
    //    }

        return isInRange;
    }

     public static boolean isTeen(int h1) {
       int startRange = 13;
       int endRange = 19;

       boolean inRange = (h1 >= startRange && h1 <= endRange);

       return inRange;
    }
}
