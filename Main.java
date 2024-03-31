import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating a student object
            Student student = new Student("John Doe", "1990-01-01");

            // Displaying student information
            student.displayStudentInfo();

            // Creating a StudentCourses object
            StudentCourses studentCourses = new StudentCourses();

            // Adding courses for different semesters
            studentCourses.addCourse(1, "Mathematics", 80);
            studentCourses.addCourse(2, "Physics", 75);
            studentCourses.addCourse(3, "Chemistry", 85);

            // Displaying course information
            studentCourses.displayCourseInfo();
        } catch (ParseException e) {
            System.err.println("Error parsing date of birth.");
            e.printStackTrace();
        }
    }
}
