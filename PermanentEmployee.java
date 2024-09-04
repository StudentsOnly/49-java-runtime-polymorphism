public class PermanentEmployee extends Employee{

    private double fixedSalary;
    private double bonus;
    static private String type = "Permanent employee";

    public PermanentEmployee(String name, double fixedSalary, double bonus){
        super(name);
        this.fixedSalary = fixedSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculatePayroll() {
        return fixedSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.print("\n" + type + " '");
        super.displayInfo();
    }
}
