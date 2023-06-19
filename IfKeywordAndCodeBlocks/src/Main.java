public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5001;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000){
            System.out.println("Your score was 5000");
        } else {
            System.out.println("Your score is greater or less than 5000");
        }

        boolean gameOvers = true;
        int scores = 1213;
        int levelCompletes = 7;
        int incentive = 1000;

        if((scores < 5000) && (score >1000)){
            System.out.print("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000){
            System.out.print("Your score was less than 1000");
        } else {
            System.out.println("Just never give up bro");
        }


    }
}