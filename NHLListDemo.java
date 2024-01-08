import java.util.*;
import java.io.*;
public class NHLListDemo
{
    public static void main(String args[]) throws IOException {
        Scanner s=new Scanner(System.in);
        String name,position,team;
        int played,scored,assists,penalty,goal,wins;
        String file_name=s.nextLine();
        File file=new File(file_name);
        Scanner input = new Scanner(file);
        NHLStats obj=new NHLStats();
        PlayerRecord ob;
        while (input.hasNext())
        {
            name = input.next();
            position = input.next();
            team = input.next();
            played=input.nextInt();
            scored=input.nextInt();
            assists=input.nextInt();
            penalty=input.nextInt();
            goal=input.nextInt();
            wins=input.nextInt();
            ob = new PlayerRecord(name,position,team,played,scored,assists,penalty,goal,wins);
            obj.add(ob);
        }
        input.close();
        FileWriter file2 = new FileWriter("nhlstatsoutput.txt");
        file2.write("NHL Results Summary\n");
        file2.write("Players with highest points and their teams:\n");
        file2.write(obj.name_team()+"\n");
        file2.write("Most aggressive players, their teams and their positions:\n");
        file2.write(obj.aggressive()+"\n");
        file2.write("Most valuable players and their teams:\n");
        file2.write(obj.MVP()+"\n");
        file2.write("Most promising players and their teams:\n");
        file2.write(obj.Promising_player()+"\n");
        file2.write("Teams that had the most number of penalty minutes:\n");
        file2.write(obj.team_penalty()+"\n");
        file2.write("Teams that had the most number of game winning goals:\n");
        file2.write(obj.team_goals()+"\n");
        file2.close();
    }
}
