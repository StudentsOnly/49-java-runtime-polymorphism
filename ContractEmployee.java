public class ContractEmployee extends Employee {
    private final double hourlyRate;
    private final int hoursWorked;

    public ContractEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayroll() {
        return hourlyRate * hoursWorked;
    }
}
