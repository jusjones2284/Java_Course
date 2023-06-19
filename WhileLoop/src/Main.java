public class Main {
    public static void main(String[] args) {
//      for(int i = 1; i <= 5; i++){
//          System.out.println(i);
//      }
//
//      int j =1;
//      while(j <= 5){
//          System.out.println(j);
//          j++;
//      }
//
//      int k = 5;
//      while(true){
//          if(k > 5){
//              break;
//          }
//          System.out.println(k);
//          k++;
//      }
//
//      int l = 1;
//      boolean isReady = false;
//      do {
//          if(l > 5){
//              break;
//          }
//          System.out.println(l);
//          l++;
//      } while (isReady);

//        int number = 0;
//        while (number < 50){
//            number += 5;
//            System.out.println(number + "_");
//        }
        int numbers = 0;
        while (numbers < 50){
            numbers += 5;
            if(numbers % 25 == 0){
                continue;
            }
            System.out.println(numbers + "_");
        }

        boolean even = isEvenNumber(4);
        System.out.println(even);

        int number = 4;
        int finishedNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while(number <= finishedNumber){
            number++;
            if(!isEvenNumber(number)){
                oddCount++;
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
            if(evenCount >= 5){
                break;
            }
        }

        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total add numbers found = " + evenCount);

    }

    public static boolean isEvenNumber(int evenNumber) {

        if((evenNumber % 2) == 0){
            return true;
        } else
            return false;
    }

}