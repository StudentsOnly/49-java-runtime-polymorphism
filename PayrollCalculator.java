public class PayrollCalculator {

    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        try {
            employees[0] = new PermanentEmployee("Olga Babina", 5000, 500);
            employees[1] = new ContractEmployee("Jane Johnson", 50, 160);
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating employee: " + e.getMessage());
            return; // Exit early if there is an error
        }

        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println();
        }
    }
}
