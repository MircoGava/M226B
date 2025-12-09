import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TournamentManager  {

    ArrayList<Team> teams = new ArrayList();

    public void addTeam(Team t)
    {
        if(teams.contains(t) )
        {
            System.out.println("Team Already Exists");
        }
        else{teams.add(t);}
    }



    public void updateScore(String teamName, int delta)
    {
        for (Team t : teams){
            if(t.getName().equals(teamName)){
                t.setPoints(t.getPoints() + delta);
            }
        }
        System.out.println("+ " + delta + " punti a " + teamName);
    }

    public void printTeamsSortedByNatural()
    {
        System.out.println("*** Squadre in ordine naturale (punteggio decrescente) ***");
        Collections.sort(teams);
        System.out.println(teams+ "\n");

    }

    public void printTeamsSortedBySchool()
    {
        System.out.println("*** Squadre ordinate per scuola ***");
        Collections.sort(teams, new ComparatorSchoolName());
        System.out.println(teams + "\n");
    }
    public void printTeamsSortedBySport(){
        System.out.println("*** Squadre ordinate per sport ***");
        Collections.sort(teams, new ComparatorSport());
        System.out.println(teams + "\n");
    }
    public void printScores(){
        System.out.println("*** Punteggi attuali ***");
        System.out.print("{");
        for (Team t : teams){
            System.out.print(t.getName() + "=" +  t.getPoints() + " ");
        }
        System.out.print("}");
    }


}
