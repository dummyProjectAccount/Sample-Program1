package main;

import model.Platform;
import model.VideoGame;

public class CollectionTracker {
    public static void main(String[] args) {
        Platform ps = new Platform("PlayStation 5", 499);
        Platform n_switch = new Platform("Nintendo Switch", 379);
        Platform xBox = new Platform("Xbox Series X", 599);
        Platform pc = new Platform("ROG Zephyrus G15", 2499);

        Platform[] platforms = new Platform[4];
        platforms[0] = n_switch;
        platforms[1] = xBox;
        platforms[2] = ps;
        platforms[3] = pc;

        VideoGame re8 = new VideoGame("Resident Evil Village", "Survival Horror", 70, ps);
        ps.playNewGameInThisPlatform();
        VideoGame botw = new VideoGame("Legend of Zelda: Breath of the Wild", "Action Adventure", 70, n_switch);
        n_switch.playNewGameInThisPlatform();
        VideoGame halo = new VideoGame("Halo Infinite", "FPS", 60, xBox);
        xBox.playNewGameInThisPlatform();
        VideoGame apex = new VideoGame("Apex Legends", "Battle Royale, FPS", 0, pc);
        pc.playNewGameInThisPlatform();

        VideoGame[] videoGames = new VideoGame[4];
        videoGames[0] = re8;
        videoGames[1] = botw;
        videoGames[2] = halo;
        videoGames[3] = apex;

        for (int i = 0; i < 20; i++) {
            int idx = i % 4;
            videoGames[idx].playGame(60 * (i + 1));
            double time = videoGames[idx].getTotalPlayTimeInHour();
            System.out.println(time);
        }

        for (VideoGame videoGame : videoGames) {
            Platform platform = videoGame.getPlatform();
            String type = platform.getName();
            System.out.println(type);
        }
        double time;
        boolean finishPlaying = re8.getFinishPlaying();
        if (finishPlaying) {
            String detail = re8.toString();
            System.out.println(detail);
        } else {
            re8.playGame(100);
            time = re8.getTotalPlayTimeInHour();
            System.out.println(time);
        }

        finishPlaying = botw.getFinishPlaying();
        if (!finishPlaying) {
            botw.playGame(120);
            botw.finishPlaying();
        }

        for (VideoGame game : videoGames) {
            String description = game.toString();
            System.out.println(description);
        }
        for (Platform platform: platforms) {
            String stat = platform.getStat();
            System.out.println(stat);
        }


    }
}
