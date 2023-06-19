public class Main {
    public static void main(String[] args) {
        for(int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
//        for (init; expression; incrument){
            //these parts are all optional
            //the initialization section declares or sets state
            //usually declaring and initalizing a loop variable,
            //before the loop begins processing.
            //expression section, once it becomes false, will end the loop processing.
            //the increment section is executed after the expression is tested
            // and is generally the place where the loop is incremented.
//        }


    }
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2.0));

//        for (double rate = 2.0; rate <= 5.0; rate++ ){
//            double interestAmount = calculateInterest(1000, rate);
//            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
//        };
//
//        for (double rates = 2.5; rates <= 10.0; rates++){
//            double interestAmounts = calculateInterest(500, rates);
//            System.out.println("500 at " + rates + "% interest = " + interestAmounts);
//        }

//        for(double ratess = 7.5; ratess <= 10; ratess++){
//            double interestAmountss = calculateInterest(100, ratess);
//            System.out.println("100 at " + ratess + "% interest = " + interestAmountss );
//        }
//
//        for(double i = 7.5; i <= 10; i += 0.25){
//            double newInterestAmount = calculateInterest(100, i);
//            System.out.println("100 at " + i + "% interest = " + newInterestAmount);
//        }

        for (double i = 7.5; i <= 10; i += 0.25){
            double interestAmount = calculateInterest(100, i);
            if(interestAmount > 8.5){
                break;
            }
            System.out.println("$100 at " + i + "% interest = $ " + interestAmount);

        }

    }

    public static double calculateInterest(double amount, double interestRate) {


        return (amount * (interestRate /100));
    }
}