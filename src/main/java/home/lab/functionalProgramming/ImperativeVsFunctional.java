package home.lab.functionalProgramming;

import java.util.List;

public class ImperativeVsFunctional {

    public static void main(final String[] argv){
        final List<String> teams = List.of("Arsenal","Brighton ","Chelsea", "Liverpool", "West Ham");
        final String targetTeam = "Man Utd";
        findTeamImperative(teams, targetTeam);
        findTeamFunctional(teams, targetTeam);

    }

    private static void findTeamImperative(final List<String> teams, final String targetTeam) {
        boolean found = false;
        for(String team : teams){
            if(team.equals(targetTeam)){
                found = true;
                break;
            }
        }

        System.out.printf("found %s? %s\n",targetTeam, found);
    }

    private static void findTeamFunctional(final List<String> teams, final String targetTeam) {
        final int found = (int) teams.stream().filter(t -> t.equals(targetTeam)).count();
        System.out.printf("found %s? %s\n",targetTeam, found > 0 ? true : false);
    }
}
