import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Team implements Comparable<Team> {
    private String name;
    private String schoolName;
    private String sport;
    private int points;

    Map<String, Integer> totalPoints = new HashMap<>();

    public Team(String name, String schoolName, String sport, int points) {
        this.name = name;
        this.schoolName = schoolName;
        this.sport = sport;
        this.points = points;
    }

    @Override
    public int compareTo(Team o) {
        int result = Integer.compare(o.points, this.points);
        if(result == 0)
        {
           return this.schoolName.compareTo(o.schoolName);
       }
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name) && Objects.equals(schoolName, team.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }

    @Override
    public String toString() {
        return name + " (" + schoolName + ") -  Sport:" + sport + " - Punti: " + points + "\n";
    }


    public String getSchoolName() {
        return schoolName;
    }

    public String getSport() {
        return sport;
    }

    public int getPoints() {
        return points;
    }

    public Map<String, Integer> getTotalPoints() {
        return totalPoints;
    }

    public String getName() {
        return name;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
