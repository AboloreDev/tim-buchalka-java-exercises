package inheritance;

public class Samsung extends Car {

    private String seatType;
    private String engineType;
    private String interiorType;

    public Samsung() {
        super("Honda", "Accord", 4, true);
    }

    public Samsung(String make, String type, int noOfWheels, boolean isWorking, String seatType, String engineType,
            String interiorType) {
        super(make, type, noOfWheels, isWorking);
        this.seatType = seatType;
        this.engineType = engineType;
        this.interiorType = interiorType;
    }

    @Override
    public String toString() {
        return "Samsung [seatType=" + seatType + ", engineType=" + engineType + ", interiorType=" + interiorType
                + ", toString()=" + super.toString() + "]";
    }

    @Override
    public void makeSound() {
        // TODO Auto-generated method stub
        super.makeSound();
    }

    @Override
    public void movement(String speed) {
        // TODO Auto-generated method stub
        super.movement(speed);
        System.out.println("Calling the default method behavior using code generator");
    }

}
