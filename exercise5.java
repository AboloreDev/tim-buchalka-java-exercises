public class exercise5 {
    public static void main(String[] args) {
        int hourOfDay = -1;
       boolean data = shouldWakeUp(true, hourOfDay);
       System.out.println(data);
    }

    public static boolean shouldWakeUp(boolean isbarking, int hourOfDay) {
       int startRange = 0;
       int endRange = 23;
       
       if (isbarking && (hourOfDay < startRange || hourOfDay > endRange)) {
            return false;
       } else if (isbarking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
       } else {
            return false;
       }
    }
}
