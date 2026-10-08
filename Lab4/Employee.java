package Lab4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private static int employeeCounter = 1000; 
    private static int totalRecords = 0;       

    private int employeeNumber;
    private String name;
    private Address address;  
    private String empType;   
    private Office office;    
    private String companyCar;

    public Employee(String name, Address address, String empType, Office office, String companyCar) {
        this.employeeNumber = employeeCounter++;
        this.name = name;
        this.address = address;
        this.empType = empType;
        this.office = office;
        
        if ("Manager".equalsIgnoreCase(empType)) {
            this.companyCar = companyCar;
        } else {
            this.companyCar = null;
        }

        this.office.addEmployee(this);
        totalRecords++;
    }

    public int getEmployeeNumber() { return employeeNumber; }
    public String getName() { return name; }

    // Method to return the total number of employee records
    public static int getTotalRecords() { 
        return totalRecords; 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(employeeNumber).append(" | Name: ").append(name).append(" | Type: ").append(empType).append("\n")
          .append("  Address: ").append(address).append("\n")
          .append("  Assigned to Room: ").append(office.getRoomNumber());
        
        if ("Manager".equalsIgnoreCase(empType) && companyCar != null && !companyCar.isEmpty()) {
            sb.append("\n  Company Car: ").append(companyCar);
        }
        return sb.toString();
    }

    // --- MAIN RUNNER MENU ---
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());
        offices.add(new Office());

        List<Employee> employees = new ArrayList<>();
        final int MAX_EMPLOYEES = 5;

        while (true) {
            System.out.println("\n--- MyHr System Menu ---");
            System.out.println("1. List all offices");
            System.out.println("2. Create a new employee record");
            System.out.println("3. List all employees");
            System.out.println("4. Exit");
            System.out.print("Select an option (1-4): ");
            
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println("\n--- Office Directory ---");
                    for (Office office : offices) {
                        System.out.println(office);
                        if (office.getEmployeeCount() > 0) {
                            for (Employee emp : office.getAssignedEmployees()) {
                                System.out.println("  - [" + emp.getEmployeeNumber() + "] " + emp.getName());
                            }
                        }
                    }
                    break;

                case "2":
                    if (Employee.getTotalRecords() >= MAX_EMPLOYEES) {
                        System.out.println("\nError: Maximum limit of " + MAX_EMPLOYEES + " employee records reached.");
                        break;
                    }

                    System.out.println("\n--- Create New Employee Record ---");
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine().trim();

                    System.out.println("Enter Address Details:");
                    System.out.print("  Street: ");
                    String street = scanner.nextLine().trim();
                    System.out.print("  City/Town: ");
                    String city = scanner.nextLine().trim();
                    System.out.print("  County: ");
                    String county = scanner.nextLine().trim();
                    Address addressObj = new Address(street, city, county);

                    String empTypeStr = "";
                    while (!empTypeStr.equals("1") && !empTypeStr.equals("2")) {
                        System.out.println("Select Employee Type:");
                        System.out.println("  1. Staff");
                        System.out.println("  2. Manager");
                        System.out.print("Choice: ");
                        empTypeStr = scanner.nextLine().trim();
                    }
                    
                    String finalEmpType = empTypeStr.equals("1") ? "Staff" : "Manager";
                    String carDetails = null;
                    if (finalEmpType.equals("Manager")) {
                        System.out.print("Enter company car details (Make/Model): ");
                        carDetails = scanner.nextLine().trim();
                    }

                    List<Office> availableOffices = new ArrayList<>();
                    for (Office o : offices) {
                        if (o.hasSpace()) {
                            availableOffices.add(o);
                        }
                    }

                    if (availableOffices.isEmpty()) {
                        System.out.println("\nError: No offices have available space (max 2 people per office).");
                        break;
                    }

                    System.out.println("Available Offices:");
                    for (int i = 0; i < availableOffices.size(); i++) {
                        Office o = availableOffices.get(i);
                        System.out.println("  " + (i + 1) + ". Room " + o.getRoomNumber() + " (" + o.getEmployeeCount() + "/2 occupied)");
                    }

                    System.out.print("Select an office number choice: ");
                    try {
                        int officeChoice = Integer.parseInt(scanner.nextLine().trim()) - 1;
                        if (officeChoice >= 0 && officeChoice < availableOffices.size()) {
                            Office selectedOffice = availableOffices.get(officeChoice);
                            
                            Employee newEmp = new Employee(name, addressObj, finalEmpType, selectedOffice, carDetails);
                            employees.add(newEmp);
                            System.out.println("\nSuccess: Created employee " + newEmp.getName() + " with ID " + newEmp.getEmployeeNumber() + ".");
                        } else {
                            System.out.println("\nInvalid choice. Employee record creation canceled.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("\nInvalid numeric input. Employee record creation canceled.");
                    }
                    break;

                case "3":
                    System.out.println("\n--- Employee Directory (Total Records: " + Employee.getTotalRecords() + ") ---");
                    if (employees.isEmpty()) {
                        System.out.println("No employee records found.");
                    } else {
                        for (Employee emp : employees) {
                            System.out.println(emp);
                            System.out.println("------------------------------");
                        }
                    }
                    break;

                case "4":
                    System.out.println("Exiting MyHr System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
