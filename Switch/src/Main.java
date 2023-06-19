public class Main {
    public static void main(String[] args) {

//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("value was 2");
//
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
// switch is good for testing the same variable
        int switchValue = 2;

        switch (switchValue) {
            case 1 -> System.out.println("Valve was 1");
            case 2 -> System.out.println("Value was equal to 2");
            default -> System.out.println("Was not 1 or 2");
        }

        String switchValues = "justin";

        switch (switchValues){

            case "ken":
                System.out.println("the value is 1");
                break;
            case "jordan":
                System.out.println("the value is 2");
                break;
            case "justin":
                System.out.println("the value is justin ");
                break;
            default:
                System.out.println(" the value wasnt any of these");
                break;
        }

        String switchWords = "Mickal";

        switch(switchWords){

            case "mike":
                System.out.println(" the case worked its mike");
                break;
            case "Gayle":
                System.out.println("the case worked its Gayle");
                break;
            case "jus":
                System.out.println("the case worked its jus");
                break;
            case "Mickal":
                System.out.println("the case really worked");
                break;
            default:
                System.out.println("none of these worked");
                break;


        }

//        int switchValuess = 5;
//
//        switch (switchValuess){
//
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.prinln("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Was a 3, a 4, or a 5");
//                System.out.println("actually it was a " + switchValuess);
//
//            default:
//                System.out.println("Was not 1, 2, 3, 4 or 5");
//                break;
//
//        }

        //Enhanced Switch Statement

        switch (switchValue){

            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3 -> System.out.println("Value was 3");
            case 4,5,6 ->{
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);

            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        //Switch Value Types
        // byte, short, int, char, Byte, Short, Integer, Character, String, enum

        String month = "APRIL";
        System.out.println( month + " is in the " + getQuarter(month) + " quarter");


    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + "is bad";
                yield badResponse;
            }
        };
    }

    public static String getQuarters(String month) {

        return switch (month){
            case "JANUARY", "FEBRUARY", "MARCH" -> "1ST";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };

    }

//    public static String getQuarter() {
//        String month = "Dec";
//
//        return swtich(month){
//            case "JANUARY", "FEBRUARY" ,"MARCH" -> "1st";
//            case "APRIL", "MAY", "JUNE" -> "2nd";
//
//        }
//    }
}