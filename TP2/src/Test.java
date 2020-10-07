public class Test {
    public static void main(String[] args) {
        Student student = new Student(1024,"Patrick","Bellot");
        //System.out.println(student.toString());


        Promotion promotion = new Promotion();
        promotion.add("Nour", "Boulahcen");
        promotion.add("Nour2", "Boulahcen");
        promotion.add("Quentin", "Lieumont");
        promotion.add("Lysiane", "Burel");
        promotion.add("Lysiane", "Burel");
        promotion.add("Patrick", "Bellot");
        promotion.quickSort();
        promotion.printToConsole();
    }
}

