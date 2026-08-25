public class intro {
    public static void main(String[] args) {
        System.out.println("Hello Fathiu");

        boolean isValidUser = true;

        if (isValidUser == true) {
            System.out.println("This is a valid user");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This isnt supposed to happen");
        }

        String nameOfCar = "Volkswagen";
        boolean isDomestic = (nameOfCar == "Volswagen") ? true : false;

        String s = isDomestic ? "This is a product of our country" : "This isn't a product of our country";
        System.out.println(s);
    }
}
