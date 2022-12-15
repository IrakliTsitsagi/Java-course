public class GameOverMethod {
    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

    }


    public static void calculateScore(boolean gameOver, int score,
                                      int levelsCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelsCompleted * bonus);
            System.out.println("Your score is " + finalScore);
        }

    }

}
