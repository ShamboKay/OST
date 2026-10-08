package Lab4;
import java.util.ArrayList;
import java.util.List;

public class Office {
    private static int roomCounter = 100; 
    private int roomNumber;
    private List<Employee> assignedEmployees; 

    public Office() {
        this.roomNumber = roomCounter++;
        this.assignedEmployees = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    // Method to return the number of employees assigned to it
    public int getEmployeeCount() {
        return assignedEmployees.size();
    }

    public boolean hasSpace() {
        return assignedEmployees.size() < 2; 
    }

    public boolean addEmployee(Employee emp) {
        if (hasSpace()) {
            assignedEmployees.add(emp);
            return true;
        }
        return false;
    }

    public List<Employee> getAssignedEmployees() {
        return assignedEmployees;
    }

    @Override
    public String toString() {
        return "Office Room " + roomNumber + " (Occupants: " + getEmployeeCount() + "/2)";
    }
}
