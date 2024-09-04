public class PermanentEmployee extends Employee {
    private final double baseSalary;
    private final double bonus;

    public PermanentEmployee(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculatePayroll() {
        return baseSalary + bonus;
    }
}
