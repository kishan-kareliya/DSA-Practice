package OOPSConcepts.Interface;

import java.util.ArrayList;

interface Game{
    void startGame();
    void pauseGame();
    void endGame();
}

class RacingGame implements Game{
    public void startGame(){
        System.out.println("Racing Game Started! Speed up and overtake opponents!");
    }
    public void pauseGame(){
        System.out.println("Racing Game Paused! Take a break.");
    }
    public void endGame(){
        System.out.println("Racing Game Ended! Your final position: 2nd place.");
    }
}

class ShootingGame implements Game{
    public void startGame(){
        System.out.println("Shooting Game Started! Take cover and eliminate enemies.");
    }
    public void pauseGame(){
        System.out.println("Shooting Game Paused! Check your ammo.");
    }
    public void endGame(){
        System.out.println("Shooting Game Ended! You survived 5 waves of enemies.");
    }
}

class PuzzleGame implements Game{
    public void startGame(){
        System.out.println("Puzzle Game Started! Match the shapes correctly.");
    }
    public void pauseGame(){
        System.out.println("Puzzle Game Paused! Take a moment to think.");
    }
    public void endGame(){
        System.out.println("Puzzle Game Completed! Your score: 5000 points.");
    }
}

class GamingConsole{
    private ArrayList<Game> games = new ArrayList();

    public void addGame(Game game){
        games.add(game);
    }

    public void startGame(Game game){
        game.startGame();
    }

    public void pauseGame(Game game){
        game.pauseGame();
    }

    public void endGame(Game game){
        game.endGame();
    }
}

public class Interface4 {
    public static void main(String args[]){
        RacingGame race = new RacingGame();
        ShootingGame shooting = new ShootingGame();
        PuzzleGame puzzle = new PuzzleGame();

        GamingConsole console = new GamingConsole();
        console.addGame(race);
        console.addGame(shooting);
        console.addGame(puzzle);

        //control individual game
        race.startGame();
        shooting.pauseGame();
        puzzle.endGame();

        //contorl game with gaming console
        console.startGame(race);
        console.endGame(race);
        console.pauseGame(shooting);
        console.endGame(puzzle);

    }
}
