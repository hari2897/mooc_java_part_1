
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        
        
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("\n");
        
        System.out.println("Top 25 by penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("\n");
        
        System.out.println("Statistics of Sidney ");
        NHLStatistics.searchByPlayer("Sidney Crosby"); 
        System.out.println("\n");
        
        System.out.println("Stats of PHI");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("\n");
        
        System.out.println("players in Anaheim Ducks");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        
    }
}
