class PermanentEmployee extends Employee {
    private double baseSalary;
    private double bonus;

    public PermanentEmployee(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculatePayroll() {
        return baseSalary + bonus;
    }
}
