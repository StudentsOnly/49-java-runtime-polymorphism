public class PermanentEmployee extends Employee {
    private static double fixedSalary = 2000;
    private double bonuses;

    public PermanentEmployee(String name, double bonuses) {
        this.name = name;
        this.bonuses = bonuses;
    }

    @Override
    double calculatePayroll() {
        return fixedSalary + bonuses;
    }
}
