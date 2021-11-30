package techmodel;

public class VideoGame {
    String title;
    String genre;
    int price;
    Platform platform;

    public VideoGame(String title, String genre, int price, Platform platform) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.platform = platform;
        this.platform.incNumGamesOnPlatform();
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Game Description: " +
                "Title='" + title +
                ", Genre='" + genre +
                ", Price=" + price;
    }

    public Platform getPlatform(){
        return this.platform;
    }
}
