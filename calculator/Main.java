package calculator;

public class Main {

    public static void main(String[] args) {
        double firstNumber = 5.0;
        double secondNumber = 0;

        Sum simpleCalc = new Sum(firstNumber, secondNumber);

        System.out.println("addition " + simpleCalc.getAdditionResult());
        System.out.println("subtraction " + simpleCalc.getSubtractionResult());
        System.out.println("multiplication " + simpleCalc.getMultiplicationResult());
        System.out.println("division " + simpleCalc.getDivisionResult());
    }

}
