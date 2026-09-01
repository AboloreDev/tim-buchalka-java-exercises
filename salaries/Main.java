package salaries;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker("Jamie", "2001-05-14", "2020-08-08");
        Employee employee = new Employee(90909090, "2002-08-08");
        SalariedEmployee sEmployee = new SalariedEmployee(20_000, true);

        System.out.println(worker.collectPay());
        worker.terminate("2020-08-08");
        System.out.println(worker.getAge());

        employee.terminate(worker.endDate);

        System.out.println(sEmployee.collectPay());

        sEmployee.retired();

        System.out.println(worker);
        System.out.println(employee);
        System.out.println(sEmployee);
    }

}
