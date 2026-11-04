package Lab6;

public class Student extends Person {
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSES = 30;

    // Constructor
    public Student(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[MAX_COURSES];
        this.grades = new int[MAX_COURSES];
    }

    // Add a course and grade
    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    // Prints the student details followed by their courses and grades
    public void printGrades() {
        // This prints "Student: John Doe(1 FairyLand Ave)" matching your output image
        System.out.print(this.toString()); 
        
        for (int i = 0; i < numCourses; i++) {
            System.out.print(" " + courses[i] + ":" + grades[i]);
        }
        System.out.println(); // Moves to the next line
    }

    // Calculate average
    public double getAverageGrade() {
        if (numCourses == 0) return 0.0;
        
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }

    // toString implementation
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}
