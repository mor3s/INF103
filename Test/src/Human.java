public class Human {
    private int age ;

    public boolean setAge(int newAge) {
        if (newAge >= 0 && newAge < 150) {
            age = newAge;
            return true;
        }
        return false;
    }
}
