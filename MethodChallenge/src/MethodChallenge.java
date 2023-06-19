public class MethodChallenge {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition( 2000);
        displayHighScorePosition("Justin", highScorePosition);
        highScorePosition = calculateHighScorePosition( 500);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePosition( 25);
        displayHighScorePosition("Tim", highScorePosition);

    }

    public static void displayHighScorePosition(String playersName, int highScorePosition) {

        System.out.print(playersName + " managed to get into position on the high score list "
                + highScorePosition + " on the high score list"
        );

    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }

//        if(playerScore >= 1000){
//            return 1;
//        } else if (playerScore >= 500){
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;


    }
}