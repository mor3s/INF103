public class Test {
    public static void main(String[] args) {
        Student student = new Student(1024,"Patrick","Bellot");
        System.out.println(student.toString());


        Promotion promotion = new Promotion();
        promotion.add("Nour", "Boulahcen");
        promotion.add("Nour2", "Boulahcen2");
        promotion.add("Nour3", "Boulahcen3");
        promotion.add("Nour4", "Boulahcen4");
        promotion.printToConsole();
    }
}

