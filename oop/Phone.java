package oop;

public class Phone {

    private String make;
    private String model;
    private String color;
    private int memory;
    private boolean isActive;

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    // public String getMake() {
    //     return setMake();
    // }
    // public String getModel() {
    //     return setModel();
    // }
    // public String getColor() {
    //     return setColor();
    // }
    // public int getMemory() {
    //     return setMemory();
    // }
    // public boolean isGetActive() {
    //     return setIsActive();
    // }
    public String describePhone() {
        return "The Phone is made by " + make + " and it is an " + model + " " + color + " " + memory + "MB" + " it is active " + isActive;
    }
}
