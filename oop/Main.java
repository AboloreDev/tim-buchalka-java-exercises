package oop;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();
        // System.out.println("make = " + phone.getMake());
        phone.setMake("Apple");
        phone.setModel("iPhone 17pro max");
        phone.setColor("Blue");
        phone.setMemory(512);
        phone.setIsActive(true);
        // System.out.println("model = " + phone.setModel());
        // System.out.println("color = " + phone.getColor());
        // System.out.println("memory = " + phone.getMemory());
        // System.out.println("isActive = " + phone.isGetActive());
        System.out.println(phone.describePhone());
    }
}
