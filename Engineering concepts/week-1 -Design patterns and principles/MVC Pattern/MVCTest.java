public class MVCTest {

    public static void main(String[] args) {

        Student student =
                new Student("John", 101, "A");

        StudentView view =
                new StudentView();

        StudentController controller =
                new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("David");

        controller.updateView();
    }
}