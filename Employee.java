public abstract class Employee {
    protected String name;

    abstract double calculatePayroll();

    String getName() {
        return this.name;
    }
}
