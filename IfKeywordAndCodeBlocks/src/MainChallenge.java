public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        calculateScore(true, 2, 5, 10);

        score = 1;
        levelCompleted = 8;
        bonus = 2;

       int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
       System.out.println("The highScore is " + highScore);

        System.out.println("This is the next high score: " +
        calculateScore(true, 1000, 8,200)
);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int  bonus){

        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore -= 5;
//            System.out.println("Your final score was " + finalScore);
        }
        return finalScore;

    }

//    public static boolean isTooYoung(int age){
//        boolean result = false;
//        if(age < 21){
//            result = true;
//        }
//        return result;
//    }i


}