public class Bottle
{
    private int row;
    private int col;
    private String name;
    private String message;
    private static int east_west;
    private static int north_south;
    public Bottle(int row, int col, String name, String message)
    {
        this.row=row;
        this.col=col;
        this.name=name;
        this.message=message;
    }
    public Bottle(){}
    public void setRow(int row)
    {
        this.row=row;
    }
    public void setCol(int col)
    {
        this.col=col;
    }
    public int getRow()
    {
        return row;
    }
    public int getCol()
    {
        return col;
    }
    public String getName()
    {
        return name;
    }
    public String getMessage()
    {
        return message;
    }
    public String toString()
    {
        String str= "Bottle named \""+name.trim()+"\" starting at ("+row+", "+col+")";
        return str;
    }
    public String output(int f, String str, int r, int c)
    {
        return f+" : "+name+" at ("+r+", "+c+") : In ocean, current taking it "+str+".";
    }
    public String toString_Problem2()
    {
        String str= name.trim()+": Starting at ("+row+", "+col+")";
        return str;
    }
}