public class exercise3 {

    public static void main(String[] args) {
        
        double kilometers = -5.6;

         double milesPerHour = toMilesPerHour(kilometers);
         System.out.println(milesPerHour);

        printConversion(kilometers);
    }
    
    public static long toMilesPerHour(double kilometersPerHour) {
        int value;

        if (kilometersPerHour < 0) {
            value = -1;
        } else {
            value = (int) Math.round(kilometersPerHour / 1.609);
        }
        return value;
    }

    public static void printConversion(double kilometersPerHour) {

       int milesPerHour = (int) toMilesPerHour(kilometersPerHour);

        if (kilometersPerHour < 0 ){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h" );
        }
    }
}
