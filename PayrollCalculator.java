class PayrollCalculator {

    public void displayPayroll(Employee employee) {
        System.out.println("Employee Payroll: €" + employee.calculatePayroll());
    }

    public static void main(String[] args) {

        Employee permanentEmployee = new PermanentEmployee(5000.70, 1000.35);
        Employee contractEmployee = new ContractEmployee(35.5, 160);

        PayrollCalculator payrollCalculator = new PayrollCalculator();


        System.out.println("====Permanent Employee:====");
        payrollCalculator.displayPayroll(permanentEmployee);

        System.out.println("====Contract Employee:====");
        payrollCalculator.displayPayroll(contractEmployee);
    }
}
