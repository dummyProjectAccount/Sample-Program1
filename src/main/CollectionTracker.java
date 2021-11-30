package main;

import personmodel.Person;
import techmodel.Platform;
import techmodel.VideoGame;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTracker {

    public static void main(String[] args) {
        Random random = new Random();

        Platform ps = new Platform("PlayStation 5", 499);
        Platform n_switch = new Platform("Nintendo Switch", 379);
        Platform xBox = new Platform("Xbox Series X", 599);
        Platform pc = new Platform("ROG Zephyrus G15", 2499);
        ArrayList<Platform> platforms = new ArrayList<>();
        platforms.add(n_switch);
        platforms.add(xBox);
        platforms.add(ps);
        platforms.add(pc);

        VideoGame re8 = new VideoGame("Resident Evil Village", "Survival Horror", 70, ps);
        VideoGame doom = new VideoGame("Doom Eternal", "FPS", 90, ps);
        VideoGame botw = new VideoGame("Legend of Zelda: Breath of the Wild",
                "Action Adventure", 70, n_switch);
        VideoGame animalCrossing = new VideoGame("Animal Crossing: New Horizons",
                "Simulation", 80, n_switch);
        VideoGame halo = new VideoGame("Halo Infinite", "FPS", 60, xBox);
        VideoGame apex = new VideoGame("Apex Legends", "Battle Royale, FPS", 0, pc);
        ArrayList<VideoGame> videoGames = new ArrayList<>();
        videoGames.add(re8);
        videoGames.add(doom);
        videoGames.add(botw);
        videoGames.add(halo);
        videoGames.add(apex);
        videoGames.add(animalCrossing);

        Person a = new Person("A");
        Person b = new Person("B");
        Person c = new Person("C");
        ArrayList<Person> household = new ArrayList<>();
        household.add(a);
        household.add(b);
        household.add(c);


        for (int j = 0; j < household.size(); j++) {
            Person p = household.get(j);
            for (int i = 0; i < 3; i++) {
                int videoGamesSize = videoGames.size();
                VideoGame g = videoGames.get(random.nextInt(videoGamesSize));
                ArrayList<VideoGame> backlog = p.getBacklog();
                backlog.add(g);
            }
            for (int i = 0; i < 2; i++) {
                int videoGamesSize = videoGames.size();
                VideoGame g = videoGames.get(random.nextInt(videoGamesSize));
                ArrayList<VideoGame> curr = p.getCurrPlaying();
                curr.add(g);
            }
            for (int i = 0; i < 1; i++) {
                int videoGamesSize = videoGames.size();
                VideoGame g = videoGames.get(random.nextInt(videoGamesSize));
                ArrayList<VideoGame> done = p.getDonePlaying();
                done.add(g);
            }
        }

        for (int j = 0; j < 20; j++) {
            int houseSize = household.size();
            Person p = household.get(random.nextInt(houseSize));
            p.playGames(60);
        }

        for (int j = 0; j < household.size(); j++) {
            Person p = household.get(j);
            p.printCollections(true, true, true);
            double playTime = p.getTotalPlayTime(true);
            System.out.println(p.getName() + " played " + playTime + " hours");
        }

        for (int j = 0; j < videoGames.size(); j++) {
            VideoGame game = videoGames.get(j);
            String description = game.toString();
            System.out.println(description);
        }

        for (int j = 0; j < platforms.size(); j++) {
            Platform p = platforms.get(j);
            String stats = p.getStat();
            System.out.println(stats);
        }

    }
}
