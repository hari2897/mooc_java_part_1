
import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<Player> name = new ArrayList<Player>();
    // private Player playerName;
    private int maxSize = 16;

    public Team(String teamName) {
        this.teamName = teamName;

    }

    public String getName() {
        return this.teamName;
    }

    public void addPlayer(Player playerName) {
        if (!(this.name.size() >= maxSize)) {
        
            this.name.add(playerName);
        }
    }

    //printPlayers should print the player name and goals in the this.name array , So we just iterate through array this.name and print one by one by using the name.toString method
    //the toString methods returns the name and goals.
    public void printPlayers() {              
        String printnames = "";
        for (Player names : this.name) {

            printnames = names.toString();
            System.out.println(printnames);
        }

    }

    public void setMaxSize(int maxSize) //For setting the maximum number number of players that can be added to this.name (Array)
    {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.name.size();    //returns the number (size) of the players (size of Array)
    }

   
   //Needs to print the total goals by the team, So the goals of everyone in the team needs to add up
   //A method goals is created in Player class which returns only the goals (this.goals) 
   //In class Team , the method goals iterates through the players in this.name and  adds all the goals (name.goals) by storing it in a var counterGoals
    public int goals() {
        int counterGoals = 0;
        for (Player name : this.name) {
            counterGoals += name.goals();
        }
        return counterGoals;

    }

}
