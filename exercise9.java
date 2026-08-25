public class exercise9 {
    public static void main(String[] args) {
        
        int seconds = 45;
        int minutes = 65;

        int p1 = 1;
        int p2 = 2;
        int p3 = 1;

        printEqual(p1, p2, p3);

        String time1 = getDurationString(3945);
        String time2 = getDurationString(seconds, minutes);

        System.out.println(time1);
        System.out.println(time2);
        printYearsAndDays(0);

        boolean data = isCatPlaying(true, 36);
        System.out.println(data);
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
           String message = "seconds must be a valid number";
            return message;
        }

       int minutes = seconds / 60;
       String time = getDurationString(seconds, minutes);
       
       return time;
    }

    public static String getDurationString(int seconds, int minutes) {

        int hours;

        if (minutes < 0) {
           String message = "minutes must be a valid number";
           return message;
            
        } else if (seconds <= 0 && seconds >= 59) {
            String message = "seconds must be a valid number";
            return message;
        } else {
            hours = minutes / 60;
            minutes = minutes % 60;           
            seconds = seconds % 60;
        }

        return hours + "h " + minutes + "m " + seconds + "s";
    };

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        
        long val = 60 * 24 * 365;
        
        long year = minutes / val;
        System.out.println(year);
        long remainingDays = (minutes % val) / (60 * 24);
        System.out.println(remainingDays);
        
     System.out.printf("%01d min = %d y and %d d", minutes, year, remainingDays);
    }

    public static void printEqual(int p1, int p2, int p3) {
       boolean isEqual = p1 == p2 && p1 == p3 && p2 == p1 && p2 == p3 && p3 == p1 && p3 == p2;
       boolean isNotEqual = p1 != p2 && p1 != p3 && p2 != p1 && p2 != p3 && p3 != p1 && p3 != p2;

        if (p1 < 0 || p2 < 0 || p3 < 0) {
            System.out.println("Invalid Value");
        } else if (isEqual) {
            System.out.println("All numbers are equal");
        } else if (isNotEqual) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int startRange = 25;
        int endRange = 35;
        int summerEndRange = 45;

        boolean isPlayRange = summer && (temperature >= startRange && temperature <= summerEndRange) ||
                                !summer && (temperature >= startRange && temperature <= endRange);

        return isPlayRange; 
    }
}
