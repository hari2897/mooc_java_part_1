
public class Player {

    private String name;
    private int goals;

    public Player(String namah, int goals) {
        this.name = namah;
        this.goals = goals;
    }

    public Player(String namah) {
        this.name = namah;
        this.goals = 0;

    }


    //Returns only the name
    public String getName() {
        return this.name;
    }

    //This method returns only the number of goals. This is used by the method goals in class Team to return the total num of goals
    public int goals() {
        return this.goals;
    }

    public String toString() {
        return this.name + ", goals " + this.goals;
    }

}
