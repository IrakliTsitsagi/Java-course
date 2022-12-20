public class HighScore {
    public static void main(String[] args) {
        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Gela", highScore);

        highScore = calculateHighScorePosition(900);
        displayHighScorePosition("Vaja", highScore);

        highScore = calculateHighScorePosition(400);
        displayHighScorePosition("Jemala", highScore);

        highScore = calculateHighScorePosition(50);
        displayHighScorePosition("Zaza", highScore);
    }

    public static void displayHighScorePosition(String playerName,
                                                int highScore) {
        System.out.println(playerName + " managed to get into position " +
                highScore + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        //method 1

     /*   if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }*/

        //method 2

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

}



