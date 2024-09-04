public class Main{
    public static void main(String[] args) {

        Employee employee1 = new PermanentEmployee("John Black", 3000, 1580);
        Employee employee2 = new ContractEmployee("Maria Punt", 120.5, 40);

        PayrollCalculator.displayInfo(employee1);
        PayrollCalculator.displayInfo(new PermanentEmployee("Barbara", 2950.5, 1900.5));
        PayrollCalculator.displayInfo(new ContractEmployee("Stive", 122, 42));
        System.out.println(PayrollCalculator.calculatePayroll(employee1));
        System.out.println(PayrollCalculator.calculatePayroll(employee2));
        PayrollCalculator.displayInfo(employee2);

    }

}
