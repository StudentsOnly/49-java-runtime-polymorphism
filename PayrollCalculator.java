public class PayrollCalculator {

    private Employee employee;

    static double calculatePayroll(Employee employee){
        return employee.calculatePayroll();
    }

    static void displayInfo(Employee employee){
        employee.displayInfo();
    }
}
