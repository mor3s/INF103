import java.util.ArrayList;

public class Promotion {
    private ArrayList<Student> studentList;

    public Promotion() {
        studentList = new ArrayList<Student>();
    }

    public int newId() {
        int id = -1;
        for (Student student : studentList) {
            if (id < student.getId()) {
                id = student.getId();
            }
        }
        return id + 1 ;
    }


    public int add(String firstName, String lastName) {
        int id = newId();
        studentList.add(new Student(id, firstName, lastName));
        return id;
    }

    public void printToConsole() {
        for (Student student : studentList) {
            student.toString();
        }
    }
}
