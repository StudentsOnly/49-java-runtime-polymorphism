public class ContractEmployee extends Employee{

    private double hourlyRate;
    private int workedHours;
    static private String type = "Contract employee";

    public ContractEmployee(String name, double hourlyRate, int workedHours){
        super(name);
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
    }

    @Override
    public double calculatePayroll() {
        return hourlyRate * workedHours;
    }

    @Override
    public void displayInfo() {

        System.out.print("\n" + type + " '");
        super.displayInfo();
    }
}
