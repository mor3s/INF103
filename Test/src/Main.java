public class Main {

    public static void main(String[] args) {
        Point p = null ; // Point p = new Point();
        p = new Point(3, 14);
        p.writeCoordinates() ;
        Point p2 = new Point(3.14, 6.28);
        p2.writeCoordinates();

        p.shift(10,3);
        p.writeCoordinates();
        System.out.println("d = " + p.distanceToOrigin());
    }

}
