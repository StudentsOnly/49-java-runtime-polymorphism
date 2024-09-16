public class PermanentEmployee extends Employee {
    private final double baseSalary;
    private final double bonus;

    public PermanentEmployee(String name, double baseSalary, double bonus) {
        super(name);

        // Validate input
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative.");
        }
        if (bonus < 0) {
            throw new IllegalArgumentException("Bonus cannot be negative.");
        }

        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculatePayroll() {
        return baseSalary + bonus;
    }
}
