import java.util.Comparator;

public class ComparatorSport implements Comparator<Team> {
    @Override
    public int compare(Team a, Team b) {
        return a.getSport().compareTo(b.getSport());
    }
}
