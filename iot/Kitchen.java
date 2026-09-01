package iot;

public class Kitchen {

    public Kitchen() {

    }
}

class Refrigerator extends Kitchen {

    protected boolean hasWorkDone;

    public Refrigerator(boolean hasWorkDone) {
        super();
        this.hasWorkDone = hasWorkDone;
    }

    public void orderFood() {
        if (hasWorkDone) {
            System.out.println("Ordering food from the refrigerator...");
        } else {
            System.out.println("Cannot order food. The refrigerator is not working.");
        }
    }
}

class DishWasher extends Kitchen {

    protected boolean hasWorkDone;

    public DishWasher(boolean hasWorkDone) {
        super();
        this.hasWorkDone = hasWorkDone;
    }

    public void doDishes() {
        if (hasWorkDone) {
            System.out.println("Doing the dishes...");
        } else {
            System.out.println("Cannot do the dishes. The dishwasher is not working.");
        }
    }
}

class CoffeeMaker extends Kitchen {

    protected boolean hasWorkDone;

    public CoffeeMaker(boolean hasWorkDone) {
        super();
        this.hasWorkDone = hasWorkDone;
    }

    public void brewCoffee() {
        if (hasWorkDone) {
            System.out.println("Brewing coffee...");
        } else {
            System.out.println("Cannot brew coffee. The coffee maker is not working.");
        }
    }
}
