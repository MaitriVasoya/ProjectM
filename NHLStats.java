import java.util.*;
public class NHLStats
{
    LinkedList<PlayerRecord> players=new LinkedList<PlayerRecord>();
    public NHLStats()
    {
    }
    public void add(PlayerRecord ob)
    {
        players.add(ob);
    }
    public boolean isEmpty()
    {
        if(players.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String name_team()
    {
        int max=0;
        int max_points=0;
        String name="";
        String team="";
        for(int i=0;i<players.size();i++)
        {
            max=(players.getAt(i).getAssists())+(players.getAt(i).getScored());
            if(max>max_points)
            {
                max_points=max;
                name=players.getAt(i).getName();
                team=players.getAt(i).getTeam();
            }
            else if(max==max_points)
            {
                name=name+"\t"+players.getAt(i).getName();
                team=team+"\t"+players.getAt(i).getTeam();
            }
        }
        return(name+"\n"+team);
    }
    public String aggressive()
    {
        int max=0;
        String name="";
        String team="";
        String position="";
        for(int i=0;i<players.size();i++)
        {
            if(players.getAt(i).getPenalty()>max)
            {
                max=players.getAt(i).getPenalty();
                name=players.getAt(i).getName();
                team=players.getAt(i).getTeam();
                position=players.getAt(i).getPosition();
            }
            else if(players.getAt(i).getPenalty()==max)
            {
                name=name+"\t"+players.getAt(i).getName();
                team=team+"\t"+players.getAt(i).getTeam();
                position=position+"\t"+players.getAt(i).getPosition();
            }
        }
        return (name+"\n"+team+"\n"+position);
    }
    public String MVP()
    {
        int max=0;
        String name="";
        String team="";
        for(int i=0;i<players.size();i++)
        {
            if(players.getAt(i).getWins()>max)
            {
                max=players.getAt(i).getWins();
                name=players.getAt(i).getName();
                team=players.getAt(i).getTeam();
            }
            else if(players.getAt(i).getWins()==max)
            {
                name=name+"\t"+players.getAt(i).getName();
                team=team+"\t"+players.getAt(i).getTeam();
            }
        }
        return (name+"\t"+team);
    }
    public String Promising_player()
    {
        int max=0;
        String name="";
        String team="";
        for(int i=0;i<players.size();i++)
        {
            if(players.getAt(i).getGoal()>max)
            {
                max=players.getAt(i).getGoal();
                name=players.getAt(i).getName();
                team=players.getAt(i).getTeam();
            }
            else if(players.getAt(i).getGoal()==max)
            {
                name=name+"\t"+players.getAt(i).getName();
                team=team+"\t"+players.getAt(i).getTeam();
            }
        }
        return (name+"\t"+team);
    }
    public String team_penalty()
    {
        LinkedList<String> teams = new LinkedList<String>();
        teams.add(players.getAt(0).getTeam());
        for (int i = 0; i < players.size(); i++)
        {
            String name = players.getAt(i).getTeam();
            int c = 0;
            for (int j = 0; j < teams.size(); j++)
            {
                if (teams.getAt(j).equals(players.getAt(i).getTeam()))
                {
                    c = 1;
                }
            }
            if (c == 0)
            {
                teams.add(players.getAt(i).getTeam());
            }
        }
        int penalty_point[] = new int[teams.size()];
        for (int i = 0; i < teams.size(); i++)
        {
            for(int j=0;j<players.size();j++)
            {
                if(teams.getAt(i).equals(players.getAt(j).getTeam()))
                {
                    penalty_point[i]+= players.getAt(j).getPenalty();
                }
            }
        }
        String temp="";
        int max=0;
        for(int i=0;i<penalty_point.length;i++)
        {
            if(penalty_point[i]>max)
            {
                max=penalty_point[i];
                temp=teams.getAt(i);
            }
            else if(penalty_point[i]==max)
            {
                temp=temp+"\t"+teams.getAt(i);
            }
        }
        return temp;
    }
    public String team_goals()
    {
        LinkedList<String> teams = new LinkedList<String>();
        teams.add(players.getAt(0).getTeam());
        for (int i = 0; i < players.size(); i++)
        {
            String name = players.getAt(i).getTeam();
            int c = 0;
            for (int j = 0; j < teams.size(); j++)
            {
                if (teams.getAt(j).equals(players.getAt(i).getTeam()))
                {
                    c = 1;
                }
            }
            if (c == 0)
            {
                teams.add(players.getAt(i).getTeam());
            }
        }
        int goals[] = new int[teams.size()];
        for (int i = 0; i < teams.size(); i++)
        {
            for(int j=0;j<players.size();j++)
            {
                if(teams.getAt(i).equals(players.getAt(j).getTeam()))
                {
                    goals[i]+= players.getAt(j).getWins();
                }
            }
        }
        String temp="";
        int max=0;
        for(int i=0;i<goals.length;i++)
        {
            if(goals[i]>max)
            {
                max=goals[i];
                temp=teams.getAt(i);
            }
            else if(goals[i]==max)
            {
                temp=temp+"\t"+teams.getAt(i);
            }
        }
        return temp;
    }

}
