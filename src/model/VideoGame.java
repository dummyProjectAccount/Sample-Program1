package model;

public class VideoGame {
    String title;
    String genre;
    int price;
    int totalPlayTimeInMin;
    boolean finishPlaying;
    Platform platform;

    public VideoGame(String title, String genre, int price, Platform platform) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.totalPlayTimeInMin = 0;
        this.finishPlaying = false;
        this.platform = platform;
    }

    public void playGame(int timeInMin) {
        this.totalPlayTimeInMin += timeInMin;
    }

    public double getTotalPlayTimeInHour() {
        return totalPlayTimeInMin / 60.0;
    }

    public void finishPlaying() {
        this.finishPlaying = true;
    }

    public boolean getFinishPlaying(){
        return this.finishPlaying;
    }

    @Override
    public String toString() {
        return "Game Description: " +
                "Title='" + title +
                ", Genre='" + genre +
                ", Price=" + price +
                ", Total_Time_Played=" + totalPlayTimeInMin / 60.0 + "hr" +
                ", Finish_Playing?=" + finishPlaying;
    }

    public Platform getPlatform(){
        return this.platform;
    }
}
