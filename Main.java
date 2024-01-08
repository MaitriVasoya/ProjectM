import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int row,col;
        row=s.nextInt();
        col=s.nextInt();
        s.nextLine();
        String grid[][]=new String[row][col];
        String coordinates=s.nextLine();
        String direction=s.nextLine();
        int number=s.nextInt();
        s.nextLine();
        int i,j;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                grid[i][j]="O";
            }
        }
        ArrayList <Bottle> bottle=new ArrayList <>();
        for(i=0;i<number;i++)
        {
            Bottle obj=new Bottle(s.nextInt(),s.nextInt(),s.nextLine(),s.nextLine());
            bottle.add(obj);
        }
        String arr[]=coordinates.split(" ");
        for(i=0;i<arr.length;i++)
        {
            int grid_row,grid_col;
            String temp[]=arr[i].split(",");
            grid_row = Integer.parseInt(temp[0]);
            grid_col = Integer.parseInt(temp[1]);
            grid[grid_row][grid_col] = "L";
        }

        String dir_arr[]=direction.split(" ");
        int k=0;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(grid[i][j].equals("O"))
                {
                    grid[i][j]=dir_arr[k];
                    k++;
                }
                else if(grid[i][j].equals("L"))
                {
                    grid[i][j]="X";
                }
            }
        }
        for(i=0;i<bottle.size();i++)
        {
            Bottle object=new Bottle();
            object=bottle.get(i);
            System.out.println(object.toString_Problem2());
        }
        boolean value=false;
        int f=0;
        int count=0;
        int n=bottle.size();
        ArrayList <Integer> row_wise=new ArrayList<>();
        ArrayList <Integer> col_wise=new ArrayList<>();
        for(i=0;i<bottle.size();i++)
        {
            row_wise.add(0);
            col_wise.add(0);
        }
        while(count<n)
        {
            for (i = 0; i < bottle.size(); i++)
            {
                Bottle bot = new Bottle();
                bot = bottle.get(i);
                int r = bot.getRow();
                int c = bot.getCol();
                int temp1=0;

                if (grid[r][c].equals("E"))
                {
                    int temp=row_wise.get(i);
                    row_wise.set(i, temp+1);
                    System.out.println(bot.output(f, grid[r][c],r,c));
                    c++;
                    bot.setRow(r);
                    bot.setCol(c);
                    if(temp<0)
                    {
                        temp1=f;
                        System.out.println((f+1)+": "+bot.getName()+" at ("+bot.getRow()+", "+bot.getCol()+"): <<NOW STUCK IN MID-OCEAN GYRE!>>");
                        f++;
                    }
                }
                else if (grid[r][c].equals("W"))
                {
                    int temp=row_wise.get(i);
                    row_wise.set(i, temp-1);
                    System.out.println(bot.output(f, grid[r][c],r,c));
                    c--;
                    bot.setRow(r);
                    bot.setCol(c);
                    if(temp>0)
                    {
                        System.out.println((f+1)+": "+bot.getName()+" at ("+bot.getRow()+", "+bot.getCol()+"): <<NOW STUCK IN MID-OCEAN GYRE!>>");
                        f++;
                    }
                }
                else if (grid[r][c].equals("N"))
                {
                    int temp=col_wise.get(i);
                    col_wise.set(i, temp-1);
                    System.out.println(bot.output(f, grid[r][c],r,c));
                    r--;
                    bot.setRow(r);
                    bot.setCol(c);
                    if(temp>0)
                    {
                        System.out.println((f+1)+": "+bot.getName()+" at ("+bot.getRow()+", "+bot.getCol()+"): <<NOW STUCK IN MID-OCEAN GYRE!>>");
                        f++;
                    }
                }
                else if (grid[r][c].equals("S"))
                {
                    int temp=col_wise.get(i);
                    col_wise.set(i, temp+1);
                    System.out.println(bot.output(f, grid[r][c],r,c));
                    r++;
                    bot.setRow(r);
                    bot.setCol(c);
                    if(temp<0)
                    {
                        System.out.println((f+1)+": "+bot.getName()+" at ("+bot.getRow()+", "+bot.getCol()+"): <<NOW STUCK IN MID-OCEAN GYRE!>>");
                        f++;
                    }
                }
                else if (grid[r][c].equals("X"))
                {
                    System.out.println(f+": "+bot.getName()+" at ("+r+", "+c+"): LANDED!");
                    System.out.println("<<MESSAGE RECEIVED: " + bot.getMessage() + ">>");
                    bottle.remove(i);
                    i--;
                    count++;
                }
            }
            f++;
        }
    }
}