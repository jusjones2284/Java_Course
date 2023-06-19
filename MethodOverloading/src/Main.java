public class Main {
    public static void main(String[] args) {
//    int newScore = calculateScore("Justin's", 80);
//    System.out.println("New score is : " + newScore);
//
//    int newScores = calculateScore(100);
//    System.out.println(newScores);
//
//    calculateScore();

    System.out.println("New score is: " + calculateScore("Mickal", 400));
    System.out.println("random player scoreaaa " + calculateScore(30));
    }


    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score = score * 1000;

    }
//    public static int calculateScore( int score) {
//
//        System.out.println("Unnamed player " + " scored " + score + " points");
//        return score = score * 1000;
//
//    }

    public static int calculateScore() {

        System.out.println("No player name, no player score");
        return 0;

    }

    public static int calculateScore(int score){
        return calculateScore("Anonymous", 500);
    }
}