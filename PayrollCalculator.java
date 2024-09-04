import java.util.ArrayList;
import java.util.List;

public class PayrollCalculator {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>(List.of(
                new PermanentEmployee("Ralf", 1_000.0,500.0),
                new ContractEmployee("Fred", 25.0,40)
        ));

        for (var employee : employees) {
            System.out.println(employee.getClass().getSimpleName() + " " +
                    employee.getName() +
                    " Payroll: $" + employee.calculatePayroll());
        }

    }

}
