package vn.duy.java.generics;

import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {
    private String name;
    private List<BaseballPlayer> teamMembers = new ArrayList<>();

    private int totalWins = 0;

    private int totalLosses = 0;

    private int totalTies = 0;

    public BaseballTeam(String name) {
        this.name = name;
    }

    public void addTeamMember(BaseballPlayer player) {
        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }

    public void listTeamMembers() {
        System.out.println(name + " Roster: ");
        System.out.println(teamMembers);
    }

    public int ranking() {
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";
        if (ourScore > theirScore) {
            this.totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            this.totalTies++;
            message = "tied";
        } else {
            this.totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return name + " (Ranked " + ranking() + ")";
    }
}
