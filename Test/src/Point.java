public class Point {
    private int x;
    private int y;

    public Point(int x0, int y0) {
        x = x0;
        y = y0;
    }
    public Point(double rho, double theta) {
        this((int)(rho * Math.cos(theta)),
                (int)(rho * Math.sin(theta)));
    }




    public void writeCoordinates() {
        System.out.print("x = ");
        System.out.println(x);
        System.out.print("y = ");
        System.out.println(y);
    }
    public void shift(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public double distanceToOrigin() {
        return Math.sqrt(x*x + y*y);
    }

}
