package person;

public class Main {

    public static void main(String[] args) {
        // String firstName = "John";
        // String lastName = "Doe";
        // int age = 13;

        // Person person = new Person(firstName, lastName, age);
        // // Getters
        // System.out.println(person.getAge());
        // // Methods
        // System.out.println("Full name: " + person.getFullName());
        // System.out.println("is this person a teen: " + person.isTeen());
        Floor floor = new Floor(2.75, 4.0);
        System.out.println("The Total Area of floor is: " + floor.getArea());

        Carpet carpet = new Carpet(3.5);
        System.out.println("The Total Cost of a carpet is: " + carpet.getCost());

        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("The Total Area of floor and carpet is: " + calculator.getTotalCost());
    }
}
