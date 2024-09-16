public class ContractEmployee extends Employee {
    private final double hourlyRate;
    private final int hoursWorked;

    public ContractEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);

        // Validate input
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayroll() {
        return hourlyRate * hoursWorked;
    }
}
