public class Ball
{
    private double bx,by;
    public Ball(double x,double y)
    {
        bx=x;
        by=y;
    }
    public void setX(double x)
    {
        bx=x;
    }
    public void setY(double y)
    {
        by=y;
    }
    public double getX()
    {
        return bx;
    }
    public double getY()
    {
        return by;
    }
    public String toString()
    {
        return "Current Position is ("+bx+" , "+by+")";
    }
}
