package techmodel;

public class Platform {
    String name;
    int price;
    int numOfGamesOnPlatform;

    public Platform(String name, int price) {
        this.name = name;
        this.price = price;
        this.numOfGamesOnPlatform =0;
    }

    public void incNumGamesOnPlatform(){
        this.numOfGamesOnPlatform++;
    }

    public String getName(){
        return this.name;
    }

    public String getStat(){
        return "You have " + this.numOfGamesOnPlatform + " game(s) on " + this.name;
    }
}
