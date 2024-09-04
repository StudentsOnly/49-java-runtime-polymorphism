public class PayrollCalculator {

    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        employees[0] = new PermanentEmployee("Olga Babina", 5000, 500);
        employees[1] = new ContractEmployee("Jane Johnson", 50, 160);

        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}
