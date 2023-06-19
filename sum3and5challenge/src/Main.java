public class Main {
    public static void main(String[] args) {

        int countOfMatches = 0;
        int sumOfMatches = 0;

        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++){
            if((loopNumber % 3 == 0) && (loopNumber % 5 == 0)){
                countOfMatches++;
                sumOfMatches += loopNumber;
                System.out.println("Found a match = " + loopNumber);
            }
            if(countOfMatches == 5){
                break;
            }
        }
        System.out.println("Sum =" + sumOfMatches);

        for (int number = 1; number < 7; number += 2){
            System.out.println("number = " + number);
        }
        for (int number = 100; number < 130; number += 10){
            System.out.println("number= " + number);
        }
    }

}