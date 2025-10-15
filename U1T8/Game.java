package U1T8;

public class Game {
    
    private String gameName; 
    private int players; 
    private int score; 

    public Game (String gameName, int players ) { 
        this.gameName = gameName; 
        this.players = players; 
        score = 0; 
    }

    public String getGameName () {
    return gameName; 
    }

    public int getPlayer () {
        return players;
    }

    public int getScore () {
        return score; 
    }

    public void addPlayer () {
        players ++; 
    }

    public void increaseScore (int increase) {
        score = score + increase; 
    }

    public double averageScorePerPlayer () {
        double avgScore = (double) score / players; 
        return avgScore; 
    }

    public boolean isGameOver () {
        boolean gameOver = true; 
        boolean gameNotOver = false; 
        if ( score >= 9 ) {
            return gameOver; 
        } else {
            return gameNotOver; 
        }
    }

}
