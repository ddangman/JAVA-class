
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
    
    //printtop 10 goals    
    System.out.println("Top ten by goals");
    NHLStatistics.sortByGoals();
    NHLStatistics.top(10);
    
    //print top 25 penalties
    NHLStatistics.sortByPenalties();
    NHLStatistics.top(25);
    
    //crosby stats
    NHLStatistics.searchByPlayer("Sidney Crosby");
    
    //PHI stats
    NHLStatistics.teamStatistics("PHI");
    
    //ANA players by points
    NHLStatistics.sortByPoints();
    NHLStatistics.teamStatistics("ANA");
    
    }
}
