public class Main {
    public static void main(String[] args) {
        PayrollCalculator pc = new PayrollCalculator();
        
        pc.addEmployee(new ContractEmployee("Bob", 160));
        pc.addEmployee(new ContractEmployee("John", 100));
        pc.addEmployee(new PermanentEmployee("Jane", 2000));
        pc.addEmployee(new PermanentEmployee("Max", 100));

        pc.calculateAndDisplayPayroll();
    }

}
