public class GameOver {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelsCompleted = 8;
        int levelBonus = 200;

        if (gameOver) {
            int finalScore = score + (levelsCompleted * levelBonus);
            System.out.println("Your score is " + finalScore);
        }
    }
}
