package Lab6;

public class Teacher extends Person {
    private int numCourses;
    private String[] courses;
    private static final int MAX_COURSES = 30;

    // Constructor
    public Teacher(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[MAX_COURSES];
    }

    // Add a course
    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false; 
            }
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    // Remove a course
    public boolean removeCourse(String course) {
        int targetIndex = -1;
        
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                targetIndex = i;
                break;
            }
        }
        
        if (targetIndex == -1) {
            return false;
        }
        
        // Shift remaining items left
        for (int i = targetIndex; i < numCourses - 1; i++) {
            courses[i] = courses[i + 1];
        }
        courses[numCourses - 1] = null;
        numCourses--;
        return true;
    }

    // toString implementation
    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
}
