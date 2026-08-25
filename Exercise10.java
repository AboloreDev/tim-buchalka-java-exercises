

public class Exercise10 {
    public static void main(String[] args) {
       char letter = 'k';
       String message = Alphabet(letter);
       System.err.println(message);

       int day = 20;
       dayOfTheWeek(day);
       dayOfTheWeek2(day);

       int number = 20;
       printNumberInWord(number);
    }


    public static String Alphabet(char letter) {
    
        String message;

        switch (letter) {
            case 'A': 
               message = "Value of letter " + letter + " is Able";
                break;
            case 'B':
            message = "Value of letter " + letter + " is Baker";
                break;
            case 'C':
               message = "Value of letter " + letter + " is Charlie";
               break;
            case 'D':
             message = "Value of letter " + letter + " is Dog";
                break;
            case 'E':
               message = "Value of letter " + letter + " is Easy";
               break;
            default:
                return "Not Found";
        }
        return message;
    }


    public static void dayOfTheWeek (int day) {
        String dayOfTheWeek;
        String message;

        switch (day) {
            case 0 -> {
                dayOfTheWeek = "Sunday";
                message = "Day " + day + " is " + dayOfTheWeek;
                System.out.println(message);
            }
            case 1 -> {
                dayOfTheWeek = "Monday";
                message = "Day " + day + " is " + dayOfTheWeek;
                System.out.println(message);
            }
            case 2 -> {
                dayOfTheWeek = "Tuesday";
                message = "Day " + day + " is " + dayOfTheWeek;
                System.out.println(message);
            }
            case 3 -> {
                dayOfTheWeek = "Wednesday";
                message = "Day " + day + " is " + dayOfTheWeek;
                System.out.println(message);
            }
            case 4 -> {
                dayOfTheWeek = "Thursday";
                message = "Day " + day + " is " + dayOfTheWeek;
                System.out.println(message);
            }
            case 5 -> {
                dayOfTheWeek = "Friday";
                message = "Day " + day + " is " + dayOfTheWeek;
                System.out.println(message);
            }
            case 6 -> {
                dayOfTheWeek = "Saturday";
                message = "Day " + day + " is " + dayOfTheWeek;
                System.out.println(message);
            }
            default -> {
                String badResponse = "Invalid Day";
                System.out.println("Day " + day + " is an " + badResponse);
            }
        }
    }

    public static void printNumberInWord (int number) {
        
        String word = switch (number) {
            case 0 -> {
                yield "ZERO";
            }
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> {
                yield "OTHER";
            }
        };

        System.out.println(word);
    }


    public static void dayOfTheWeek2 (int day) {
        String dayOfTheWeek;
        String message;

        if (day == 0) {
            dayOfTheWeek = "Sunday";
                message = "Day " + day + " is " + dayOfTheWeek;
                System.out.println(message);
        } else if (day == 1) {
             dayOfTheWeek = "Monday";
                message = "Day " + day + " is " + dayOfTheWeek;
                System.out.println(message);
        } else if (day == 2) {
            dayOfTheWeek = "Tuesday";
                message = "Day " + day + " is " + dayOfTheWeek;
                System.out.println(message);
        } else if (day == 3) {
            dayOfTheWeek = "Wednesday";
                message = "Day " + day + " is " + dayOfTheWeek;
                System.out.println(message);
        } else if (day == 4) {
            dayOfTheWeek = "Thursday";
                message = "Day " + day + " is " + dayOfTheWeek;
                System.out.println(message);
        } else if (day == 5) {
            dayOfTheWeek = "Friday";
                message = "Day " + day + " is " + dayOfTheWeek;
                System.out.println(message);
        } else if (day == 6) {
            dayOfTheWeek = "Saturday";
                message = "Day " + day + " is " + dayOfTheWeek;
                System.out.println(message);
        } else {
             String badResponse = "Invalid Day";
             System.out.println("Day " + day + " is an " + badResponse);
        }
    }


    
}
