package inheritance;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry", 4, true);
        doSomething(car, "Slow");

        Samsung samsung = new Samsung();
        doSomething(samsung, "Fast");

        Samsung samsung1 = new Samsung("Toyota", "Sienna", 4, true, "Leather", "2GR", "Fabric");
        doSomething(samsung1, "Super Fast");
    }

    public static void doSomething(Car car, String speeed) {
        car.makeSound();
        car.movement(speeed);
        System.out.println(car);
        System.out.println("---------");
    }
}
