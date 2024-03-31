import java.util.HashMap;
import java.util.Map;

public class StudentCourses {
    private Map<Integer, String> semesterCourses = new HashMap<>();
    private Map<Integer, Integer> marksObtained = new HashMap<>();

    public void addCourse(int semester, String course, int marks) {
        semesterCourses.put(semester, course);
        marksObtained.put(semester, marks);
    }

    public void displayCourseInfo() {
        System.out.println("Semester-wise Courses and Marks Obtained:");
        for (Map.Entry<Integer, String> entry : semesterCourses.entrySet()) {
            int semester = entry.getKey();
            String course = entry.getValue();
            int marks = marksObtained.get(semester);
            System.out.println("Semester " + semester + ": " + course + ", Marks Obtained: " + marks);
        }
    }
}
