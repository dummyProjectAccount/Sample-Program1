package personmodel;

import techmodel.VideoGame;

import java.util.ArrayList;

public class Person {
    String name;
    int totalPlaytime;
    ArrayList<VideoGame> currPlaying;
    ArrayList<VideoGame> backlog;
    ArrayList<VideoGame> donePlaying;


    public Person(String name) {
        this.name = name;
        this.currPlaying = new ArrayList<>();
        this.backlog = new ArrayList<>();
        this.donePlaying = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<VideoGame> getCurrPlaying() {
        return currPlaying;
    }

    public ArrayList<VideoGame> getBacklog() {
        return backlog;
    }

    public ArrayList<VideoGame> getDonePlaying() {
        return donePlaying;
    }

    public void printCollections(boolean curr, boolean back, boolean done) {
        if (curr) {
            System.out.println(this.currPlaying);
        }
        if (back) {
            System.out.println(this.backlog);
        }
        if (done) {
            System.out.println(this.donePlaying);
        }
    }

    public void playGames(int timeInMin) {
        this.totalPlaytime += timeInMin;
    }

    public double getTotalPlayTime(boolean inHours) {
        if (inHours) {
            return this.totalPlaytime / 60.0;
        }
        else {
            return this.totalPlaytime;
        }
    }

}
