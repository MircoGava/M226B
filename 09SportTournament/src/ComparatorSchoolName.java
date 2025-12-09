import java.util.Comparator;

public class ComparatorSchoolName implements Comparator<Team> {

    @Override
    public int compare(Team a, Team b) {
        return a.getSchoolName().compareTo(b.getSchoolName());
    }
}
