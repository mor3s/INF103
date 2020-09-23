public class Vector
{
    private int dx ;
    private int dy ;
    private double length ;

    public Vector(int dx, int dy)
    {
        setDxDy(dx,dy) ;
    }

    public void setDxDy(int newDx,int newDy)
    {
        dx = newDx ;
        dy = newDy ;
        length = Math.sqrt(dx*dx + dy*dy) ;
    }
}