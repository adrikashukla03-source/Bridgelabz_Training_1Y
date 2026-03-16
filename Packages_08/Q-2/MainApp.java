import com.university.department.cse.Course;

public class MainApp {
    public static void main(String[] args) {
        Course c = new Course(101, "Introduction to CSE", 4);

        System.out.println("Course Code: " + c.code);
        System.out.println("Course Title: " + c.title);
        System.out.println("Credits: " + c.credits);
    }
}
