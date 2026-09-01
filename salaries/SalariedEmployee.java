package salaries;

public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(double annualSalary, boolean isRetired) {
        super(90909090, "2008-08-08");
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retired() {
        int empAge = getAge();
        isRetired = empAge > 65 ? true : false;

        if (isRetired) {
            System.out.println("Employee " + employeeId + " has retired");
        } else {
            System.out.println("Employee " + employeeId + " is still in service.");
        }
    }

    @Override
    public double collectPay() {
        return annualSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee [annualSalary=" + annualSalary + ", isRetired=" + isRetired + ", toString()="
                + super.toString() + "]";
    }

}
