import java.util.*;
public class Player
{
    private String name;
    public Player(String name)
    {
        this.name=name;
    }
    public void kick(Field f, Ball b, double d, double r)
    {
        double newX,newY;
        double radians = Math.toRadians(r);
        newX=b.getX()+d * Math.cos(radians);
        newY=b.getY()+d * Math.sin(radians);
        if(newX>f.getXpos()+f.getLength() && newY<=f.getYpos()+f.getWidth())
        {
            newX=b.getX();
            System.out.println("Ball reflected");
        }
        else if(newX<=f.getXpos()+f.getLength()&&newY>f.getYpos()+f.getWidth())
        {
            newY=b.getY();
            System.out.println("Ball reflected");
        }
        else if(newX>f.getXpos()+f.getLength()&&newY>f.getYpos()+f.getWidth())
        {
            newX=b.getX();
            newY=b.getY();
            System.out.println("Ball reflected to original position");
        }
        b.setX(newX);
        b.setY(newY);
    }
    public String toString()
    {
        return name;
    }
}
