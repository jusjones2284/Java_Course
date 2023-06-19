public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Tim");

//        boolean isAlien = false;
//        if (isAlien == false)
//            System.out.println("I am not an alien");

        boolean isAlien = true;
        if (isAlien == true) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 99;
        if (topScore == 99) {
            System.out.println("You got the top score!");
            System.out.println("Jus you are the first software engineer in the family! congrats bro!");
        }

        int secondTopScore = 100;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 1000) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not suppose to happen");
        }

        String makeOfCar = "volkswagen";
        boolean isDomestic = makeOfCar == "volkswagen" ? true : false;
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String makeOfTruck = "Tahoe";
        boolean isInternational = makeOfTruck == "Tahoe" ? true : false;
        if (isInternational) {
            System.out.println("This is my new truck!");
        }

        int ageOfClient = 20;
        String ageText = ageOfClient > 18 ? "Over Eighteen" : "Still a kid";
        System.out.println("Our Client is" + ageText);

        int ageOfGf = 34;
        String agTx = ageOfGf > 28 ? "Just the right age" : "You are too young";
        System.out.println("Our client is" + agTx);

        String s = (isDomestic) ? "This Car is domestic" : "This car is not domestic";
        System.out.println(s);

        double firstVariable = 20.00;
        double secondVariable = 80.00;
        double firstTotal = (firstVariable + secondVariable) * 100d;
        double secondTotal = (firstTotal % 40d);
        System.out.println("this is the second total " + secondTotal);
        boolean thirdTotal = (secondTotal == 0.00) ? true : false;
        System.out.println(thirdTotal);

        if (!thirdTotal){
            System.out.println("got some remainder");
        }

    }

        //String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
        //boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        //boolean isDomestic = (makeOfCar != "Volkswagen")



}







