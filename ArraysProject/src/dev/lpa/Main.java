package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] =50;
        myIntArray[4] = 10;
        myIntArray[2] = 5;
        int[] myIntsArray = new int[4];
        myIntsArray[1] = 8;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        double[] myDoublesArray = new double[15];
        myDoublesArray[8] = .0;
        System.out.println(myDoubleArray);

        int [] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first = " + firstTen[2]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + firstTen[arrayLength-2]);
        int [] secondTen = {11,12,13,14,15,16,17,18,19,20};

        int [] newArray;
        newArray = new int[] {5, 4, 3, 2, 1};
        for(int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i] + " ");
        }

//        int [] newArrayes;
//        newArrayes = new int[5];
//        for(int i = 0; i < newArrayes.length; i++){
//            newArrayes = newArrayes.length - i;
//        }

        int [] newArrays;
        newArrays = new int[5];

        for(int i = 0; i < newArrays.length; i++){
            newArrays[i] = newArrays.length - 1;
        }

        for( int i = 0; i < newArrays.length; i++){
            System.out.println(newArrays[i] + "");
        }

        System.out.print("");
        for(int element : newArrays){
            System.out.println(element + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(newArrays));

        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array"); 
        }






    }
}