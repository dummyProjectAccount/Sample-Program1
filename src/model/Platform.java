package model;

public class Platform {
    String name;
    int price;
    int numOfGamesPlayed;

    public Platform(String name, int price) {
        this.name = name;
        this.price = price;
        this.numOfGamesPlayed =0;
    }

    public void playNewGameInThisPlatform(){
        this.numOfGamesPlayed++;
    }

    public String getName(){
        return this.name;
    }

    public String getStat(){
        return "You have played " + this.numOfGamesPlayed + " game(s) with " + this.name;
    }
}
