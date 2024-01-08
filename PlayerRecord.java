public class PlayerRecord
{
    private String name,position,team;
    private int played,scored,assists,penalty,goal,wins;
    public PlayerRecord(String name,String position,String team,int played,int scored,int assists,int penalty,int goal,int wins)
    {
        this.name=name;
        this.position=position;
        this.team=team;
        this.played=played;
        this.scored=scored;
        this.assists=assists;
        this.penalty=penalty;
        this.goal=goal;
        this.wins=wins;
    }
    public String toString()
    {
        return (name+"\t"+position+"\t"+team+"\t"+played+"\t"+scored+"\t"+assists+"\t"+penalty+"\t"+goal+"\t"+wins);
    }
    public String getName()
    {
        return name;
    }
    public String getPosition()
    {
        return position;
    }
    public String getTeam()
    {
        return team;
    }
    public int getPlayed()
    {
        return played;
    }
    public int getScored()
    {
        return scored;
    }
    public int getAssists()
    {
        return assists;
    }
    public int getPenalty()
    {
        return penalty;
    }
    public int getGoal()
    {
        return goal;
    }
    public int getWins()
    {
        return wins;
    }

}
