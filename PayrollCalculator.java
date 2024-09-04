import java.util.ArrayList;

public class PayrollCalculator {
    private ArrayList<Employee> employees;

    public PayrollCalculator() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void calculateAndDisplayPayroll() {
        for (var employee : employees) {
            System.out.println(
                    "Employee type: " + employee.getClass().getName() +
                            ", Name: " + employee.getName() +
                            ", Payroll: " + employee.calculatePayroll());
        }
    }
}
