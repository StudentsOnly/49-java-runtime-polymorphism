public class ContractEmployee extends Employee {
    private static double hourlyRate = 15;
    private double hoursWorked;

    public ContractEmployee(String name, double hoursWorked) {
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculatePayroll() {
        return hourlyRate * hoursWorked;
    }

}
