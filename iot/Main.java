package iot;

public class Main {

    public static void main(String[] args) {

        // Kitchen kitchen = new Kitchen();
        Refrigerator refrigerator = new Refrigerator(false);
        CoffeeMaker coffeMaker = new CoffeeMaker(false);
        DishWasher dishWasher = new DishWasher(false);

        SmartKitchen smartKitchen = new SmartKitchen(coffeMaker, dishWasher, refrigerator);

        smartKitchen.addWater();
        smartKitchen.loadDishwasher();
        smartKitchen.pourMilk();
        // smartKitchen.setKitchenState(true, true, true);

        smartKitchen.doKitchenWork();
    }

}
