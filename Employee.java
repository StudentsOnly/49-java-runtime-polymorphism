public class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculatePayroll() {
        return 0.0;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Payroll: " + calculatePayroll());
        System.out.println();
    }
}
