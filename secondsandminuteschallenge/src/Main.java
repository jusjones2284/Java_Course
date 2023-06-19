public class Main {
    public static void main(String[] args) {

       getDurationString(3945);
       getDurationString(65, 45);

    }

    public static String getDurationString(int seconds) {

        int minutes = seconds/60;
        int hours = minutes/60;

        if (seconds < 0){
            return "Invalid data for seconds (" + seconds +"), must be a positive interger value";
        }
        return getDurationString(minutes, seconds);
//        int remainingMinutes = minutes % 60;
//
//        int remainingSeconds = seconds % 60;
//
//        return hours + "h" + remainingMinutes + "m " + remainingSeconds + "s";



    }

    public static String getDurationString(int minutes, int seconds) {

        int hours = minutes /60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;


        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";

    }
}