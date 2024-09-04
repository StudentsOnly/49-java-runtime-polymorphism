abstract class Employee {
    private String name;
   static private String type;

    Employee(String name){
        this.name = name;
    }

   abstract public double calculatePayroll();
    public void displayInfo(){
        System.out.println( name + "':");
        System.out.println("\tPayroll = " + String.format("%.2f", calculatePayroll()) + "$");
    }
}
