public class Main {
    public static void main(String[] args) {
        System.out.print(convertToCentimeters(5,8)) ;
    }
    public static double convertToCentimeters(int totalInches){
        double totalCentimeters = totalInches * 2.54;
        return totalCentimeters;
    }

    public static double convertToCentimeters(int heightInFeet , int heightInInches) {

        int feetToInches = heightInFeet * 12;
        int totalInches = feetToInches + heightInInches;
       double cmv =  convertToCentimeters(totalInches);
        return cmv;
    }

}