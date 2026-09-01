package iot;

public class SmartKitchen extends Kitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        super();
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater() {
        brewMaster.hasWorkDone = true;
    }

    public void pourMilk() {
        iceBox.hasWorkDone = true;
    }

    public void loadDishwasher() {
        dishWasher.hasWorkDone = true;
    }

    public void setKitchenState(boolean brewMaster, boolean iceBox, boolean dishWasher) {
        this.brewMaster.hasWorkDone = brewMaster;
        this.iceBox.hasWorkDone = iceBox;
        this.dishWasher.hasWorkDone = dishWasher;
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
