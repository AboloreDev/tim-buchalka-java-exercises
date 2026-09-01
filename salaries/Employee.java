package salaries;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Worker {

    protected long employeeId;
    private String hireDate;

    public Employee(long employeeId, String hireDate) {
        super("John", "2001-12-25", "2027-08-08");
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public void terminate(String endDate) {
        LocalDate dateOfHire = LocalDate.parse(hireDate);
        LocalDate dateOfRetire = LocalDate.parse(endDate);

        int retirement = Period.between(dateOfHire, dateOfRetire).getYears();

        if (retirement > 30) {
            System.out.println(name + " of ID: " + employeeId + " is terminated");
        }
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", hireDate=" + hireDate + ", toString()=" + super.toString()
                + "]";
    }

}
