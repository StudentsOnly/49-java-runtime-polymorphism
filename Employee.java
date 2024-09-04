public class Employee {
    private String name;
    private int id;
    private static int lastId = 0;

    public Employee(String name) {
        this.name = name;
        this.id = ++lastId;
    }

    public double calculatePayroll() {
        return 0.0;
    }

    public String getName() {
        return name;
    }
}
