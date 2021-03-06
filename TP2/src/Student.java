public class Student {
    private final int id;
    private String firstname;
    private String lastname;

    public Student(int id, String firstname, String lastname) {
        super();
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " " + '(' + id + ')';
    }

    int compareTo(Student anotherStudent) {
        int compareLast = this.lastname.compareTo(anotherStudent.lastname);
        int compareFirst = this.firstname.compareTo(anotherStudent.firstname);

        if (compareLast != 0) {
            return compareLast;
        }
        if (compareFirst != 0) {
            return compareFirst;
        }
        if (this.id < anotherStudent.id) {
            return -1;
        } else {
            return 1;
        }
    }

}
