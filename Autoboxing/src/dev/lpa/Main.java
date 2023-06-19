package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15); //prefered but unneccessary
        int unboxedInt = boxedInt.intValue(); //unnecessary

        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());

        Double resultedBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        Character [] characterArray = {'a', 'b', 'c', 'd'};

        private static int returnAnInt(Integer i){

            return i;
        }

        private static Integer returnAnInteger(int i){

            return i;

        }



    }

    private static Double getDoubleObject() {

        return Double.valueOf(100.0);

    }

    private static double getLiteralDoublePrimitive(){

        return 100.0;
    }


}