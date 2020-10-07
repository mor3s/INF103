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
            System.out.println(student.toString());
        }
    }

    private void swap(int i, int j) {
        Student a = studentList.get(i);
        Student b = studentList.get(j);
        studentList.set(i, b);
        studentList.set(j, a);
    }
    public void selectionSort() {
        int n = studentList.size();
        for (int i = 0; i < n-1; i++) {
            int smallerIndex = i;
            Student mini = studentList.get(i);
            for (int j = i+1; j < n; j++) {
                if (studentList.get(j).compareTo(mini) < 0) {
                    smallerIndex = j;
                    mini = studentList.get(j);
                }
            }
            swap(i, smallerIndex);

        }
    }

    private int partition(int g, int d) {
        Student key = studentList.get(g);
        int i = g + 1;
        int j = d;
        while (i <= j) {
            while (i <= j && studentList.get(i).compareTo(key) <= 0) {
                i++;
            }
            while (j >= i && studentList.get(j).compareTo(key) > 0) {
                j--;
            }
            if (i < j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        swap(g, j);
        return j;
    }

    private void quickSort(int g, int d) {
        if (g < d) {
            int j = partition(g, d);
            quickSort(g, j-1);
            quickSort(j+1, d);
        }
    }

    public  void quickSort() {
        quickSort(0, studentList.size()-1);
    }


}
