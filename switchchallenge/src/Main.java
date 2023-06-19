public class Main {
    public static void main(String[] args) {

        printDayofWeek(0);
        printWeekDay(9);

        char newVar = 'a';

        switch(newVar){
            case 'A':
                System.out.print( newVar + "  is able");
                break;
            case 'B':
                System.out.print( newVar + " is Baker");
                break;
            case 'C':
                System.out.print( newVar + " is Charlie");
                break;
            case 'D':
                System.out.print( newVar + " is Dog");
                break;
            default:
                System.out.print( "letter " + newVar + " was not found in switch");

        }



    }

    public static void printDayofWeek(int day) {

        String dayOfTheWeek = switch(day){
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Tuesday";
            default -> "Invaild Day";

        };
        System.out.println(day + " stands for " + dayOfTheWeek);

    }

    public static void printWeekDay(int day) {

        String dayOfWeek = "Invalid day";
        if (day == 1){
            dayOfWeek = "Sunday";
        } else if (day == 2){
            dayOfWeek = "Monday";
        } else if (day == 3){
            dayOfWeek = "Tuesday";
        } else if (day == 4) {
            dayOfWeek = "Wednesday";
        } else if (day == 5){
            dayOfWeek = "Thursday";
        } else if (day == 6){
            dayOfWeek = "Friday";
        } else if (day == 7) {
            dayOfWeek = "Saturday";
        } else dayOfWeek = dayOfWeek;

        System.out.println(day + " stands for " + dayOfWeek);

    }
}