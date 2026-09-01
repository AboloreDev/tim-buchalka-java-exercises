package salaries;

import java.time.LocalDate;
import java.time.Period;

public class Worker {

    protected String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        LocalDate dob = LocalDate.parse(birthDate);

        int age = Period.between(dob, today).getYears();

        if (age > 125 || age < 0) {
            System.out.println("Invalid Age");
            return -1;
        } else {
            return age;
        }

    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {

    }

    @Override
    public String toString() {
        return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
    }

}
