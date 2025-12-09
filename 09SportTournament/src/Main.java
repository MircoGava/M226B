//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TournamentManager tournamentManager = new TournamentManager();

        Team team1 = new Team("Trevaniani","CPT Trevano","Pallavolo",23);
        Team team2 = new Team("Csiani","Csia","Calcio",12);
        Team team3 = new Team("Lupi","Liceo Savosa","Basket",23);
        Team team4 = new Team("RubaCuori","Armenia medie","Tchoukball",1);
        Team team5 = new Team("RubaMogli","Armenia medie","Baseball",11);

        tournamentManager.addTeam(team1);
        tournamentManager.addTeam(team2);
        tournamentManager.addTeam(team3);
        tournamentManager.addTeam(team4);
        tournamentManager.addTeam(team5);

        tournamentManager.printTeamsSortedByNatural();
        tournamentManager.printTeamsSortedBySchool();
        tournamentManager.printTeamsSortedBySport();
        tournamentManager.updateScore("Lupi", 3);
        tournamentManager.printScores();

    }
}