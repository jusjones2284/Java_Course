public class Main {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++ ){
            Student s = new Student("S92300" + i,
                    switch (i){
                    case 1 -> "Mary";
                    case 2 -> "Carol";
                    case 3 -> "Justin";
                    case 4 -> "Mickal";
                    case 5 -> "Jones";
                        default -> "Anonymous";
                    },"12/22/1984", "Java Masterclass"
                    );
            System.out.println(s);
        }
    }
}