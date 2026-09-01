package inheritance;

public class Car {

    // Fields
    private String make;
    private String type;
    private int noOfWheels;
    private boolean isWorking;

    public Car(String make, String type, int noOfWheels, boolean isWorking) {
        this.make = make;
        this.type = type;
        this.noOfWheels = noOfWheels;
        this.isWorking = isWorking;
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", type=" + type + ", noOfWheels=" + noOfWheels + ", isWorking=" + isWorking
                + "]";
    }

    public void makeSound() {
        System.out.println(make + " " + type + " makes some kind of noise");
    }

    public void movement(String speed) {
        System.out.println(make + " " + type + " is very " + speed);
    }
}
