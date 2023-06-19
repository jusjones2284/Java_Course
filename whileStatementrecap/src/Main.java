public class Main {
    public static void main(String[] args) {
//        while (condition){
//            //statements
//        }
//
//        do {
//            will execute at least once
//        }while(condition);

//        int count = 1;
//        while(count <= 5){
//            System.out.println("count = " + count);
//            count+=2;
//        }
//
//        for(int i = 0; i <=5; i += 2){
//            System.out.println("i = " + i);
//        }
//
//        int number = 0;
//        while (number < 15){
//            number++;
//
//            if(number <= 5){
//                System.out.println("Skipping number " + number);
//                continue;
//            }
//            System.out.println("number= " + number);
//            if(number >= 10){
//                System.out.println("Breaking at " + number);
//                break;
//            }
//        }

        int number = 0;
        while (number < 15){
            number++;
            if (number <= 5){
                System.out.println("Skipping number " + number);
                continue;
            }
            System.out.println("number = " + number);
            if (number >= 10){
                System.out.println("Breaking at " + number);
                break;
            }

        }

    }
}