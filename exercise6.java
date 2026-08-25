public class exercise6 {

    public static void main(String[] args) {
        boolean data = isLeapYear(2100);
        System.out.println(data);

        System.out.println( getFullCalendatDetails(1, 2020));
        System.out.println( getFullCalendatDetails(2, 2020));
        System.out.println(  getFullCalendatDetails(2, 2018));
        System.out.println( getFullCalendatDetails(-1, 2020));
        System.out.println( getFullCalendatDetails(1, -2020));
    }
    
    public static boolean isLeapYear(int year)  {
        int startYearRange = 1;
        int endYearRange = 9999;

        if (year < startYearRange || year > endYearRange) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } 
        else if ( year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year)  {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
        return -1;
        }
        
        int numberOfDays = switch (month) {
             case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };

        return numberOfDays;
    };

    public static String months (int month) {

        String monthName = switch (month) {
        case 1 -> "January";
        case 2 -> "February";
        case 3 -> "March";
        case 4 -> "April";
        case 5 -> "May";
        case 6 -> "June";
        case 7 -> "July";
        case 8 -> "August";
        case 9 -> "September";
        case 10 -> "October";
        case 11 -> "November";
        case 12 -> "December";
        default -> "Invalid Month";
        };

        return monthName;
    }

    public static String getFullCalendatDetails(int month, int year ) {
        int value = getDaysInMonth(month, year);
        String monthString = months(month);

        if (value == -1) {
            return "Invalid Month or Year";
        }

        return "The month of " + monthString + " has " + value + " days.";
    }
    
}
