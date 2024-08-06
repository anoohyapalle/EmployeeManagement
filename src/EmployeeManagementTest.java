
public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManagement empManagement = new EmployeeManagement();

     
        empManagement.addEmployee(new Employee(1, "Anoohya", "Hyderabad"));
        empManagement.addEmployee(new Employee(2, "Devika", "Bangalore"));
        empManagement.addEmployee(new Employee(3, "Praisee", "Mumbai"));


        System.out.println("Employees after adding:");
        empManagement.displayEmployees();

   
        empManagement.updateEmployee(2, "Kolkata");
        System.out.println("\nEmployees after updating address of employee with ID 2:");
        empManagement.displayEmployees();

                empManagement.removeEmployee(3);
        System.out.println("\nEmployees after removing employee with ID 3:");
        empManagement.displayEmployees();
    }
}
