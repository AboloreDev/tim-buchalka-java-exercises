package calculator;

public class Sum {

    private double firstNumber;
    private double secondNumber;

    // Using constructors
    public Sum(double firstNumber, double lastName) {
        this.firstNumber = firstNumber;
        this.secondNumber = lastName;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return (firstNumber + secondNumber);
    }

    public double getSubtractionResult() {
        return (firstNumber - secondNumber);
    }

    public double getMultiplicationResult() {
        return (firstNumber * secondNumber);
    }

    public double getDivisionResult() {

        if (secondNumber == 0) {
            return 0;
        }

        return (firstNumber / secondNumber);
    }
}
