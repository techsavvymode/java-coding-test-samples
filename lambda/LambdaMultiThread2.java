package com.java.lambda;

import java.util.Random;

class RandomPlayer{
    public void playGame(String gameName) throws InterruptedException {
        System.out.println(gameName+" game started");
        Thread.sleep(500);
        System.out.println(gameName+" game ended");
    }
    public void playMusic(String trackName) throws InterruptedException {
        System.out.println(trackName+" track started");
        Thread.sleep(500);
        System.out.println(trackName+" track ended");
    }
}

public class LambdaMultiThread2 {
    static String[] games = {"Nintendo", "Roblox", "Minecraft"};
    static String[] tracks = {"This girl is on fire", "Nothing gonna change my love", "I still believe"};

    public static void main(String[] args) {
        RandomPlayer randomPlayer = new RandomPlayer();
        Random random = new Random();

        Runnable gameRunner= () ->{
            try{
                randomPlayer.playGame(games[random.nextInt(games.length)]);
            }
            catch (InterruptedException e){
                e.getMessage();
            }
        };

        Runnable trackRunner=()->{
          try {
              randomPlayer.playMusic(tracks[random.nextInt(tracks.length)]);
          } catch (InterruptedException e) {
              e.getMessage();
          }
        };

        Thread game = new Thread(gameRunner);
        Thread track = new Thread(trackRunner);

        game.start();
        track.start();

    }


}
