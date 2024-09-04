public class ContractEmployee extends Employee {

    private double hourlyRate;
    private int hoursWorked;

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
