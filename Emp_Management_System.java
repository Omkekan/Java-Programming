import java.util.LinkedList;
import java.util.Scanner;
public class Emp_Management_System
{
    public static void main(String[] args) {
        //Creating a linked list of type `employee`
        LinkedList<Employee> list=new LinkedList<>();
        //adding:creat object of employee and add directly
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add New Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Delete Employee by ID");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            // Check if input is valid to prevent exceptions
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); 
            }
            choice = sc.nextInt();
            int emp_id; String name ,gender; float salary;
        switch(choice) {
                case 1:
                    System.out.print("Enter Employee id: ");
                    emp_id = sc.nextInt();
                    System.out.print("Enter Employee name: ");
                    name = sc.nextLine();
                    sc.next();
                    System.out.print("Enter Employee gender: ");
                    gender = sc.next();
                    sc.next();
                    System.out.print("Enter Employee salary: ");
                    salary = sc.nextFloat();
                    Employee newEmp = new Employee(emp_id, name, gender, salary);
                    list.addLast(newEmp);
                    break;
 
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        // Built-in LinkedList features to retrieve without removing
                        System.out.println("\n--- First Employee ---");
                        list.getFirst().display_employee();
                        
                        System.out.println("\n--- Last Employee ---");
                        list.getLast().display_employee();
                    }
                    break;
 
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        System.out.println("\n--- Employee Records ---");
                        for (Employee emp : list) {
                            emp.display_employee();
                        }
                    }
                    break;
 
                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean deleted = false;
                    
                    for (Employee emp : list) {
                        if (emp.e_id == deleteId) {
                            list.remove(emp);
                            System.out.println("Employee record deleted successfully!");
                            deleted = true;
                            break;
                        }
                    }
                    
                    if (!deleted) {
                        System.out.println("Employee with ID " + deleteId + " not found.");
                    }
                    break;
                    
                case 0:
                    System.out.print("\nExiting...");
                    break;
 
                default:
                    System.out.print("\nInvalid choice");
            }
 
        } while(choice != 0);
        sc.close();
    }
}
