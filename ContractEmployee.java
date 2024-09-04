class ContractEmployee extends Employee {
    private double hourlyRate;
    private int workedHours;

    public ContractEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.workedHours = hoursWorked;
    }

    @Override
    public double calculatePayroll() {
        return hourlyRate * workedHours;
    }
}
