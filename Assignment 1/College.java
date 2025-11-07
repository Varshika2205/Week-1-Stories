import java.util.ArrayList;
import java.util.List;

public class College {
    private int id;
    private int age;
    private List<Student> students = new ArrayList<>();

    public College(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "College{id=" + id + ", age=" + age + ", students=" + students + "}";
    }
}