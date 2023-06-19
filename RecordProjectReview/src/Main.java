public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            JMJStudent s = new JMJStudent(
                    "S92300" + i, switch (i){
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Justin";
                        case 4 -> "Mickal";
                        case 5 -> "Jones";
                default -> "Anonymous";
            }, "05/11/1985",
                    "Java Masterclass"

            );
            System.out.println(s) ;
        }
        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985",
                "Java Masterclass");

        JMJStudent recordStudent = new JMJStudent("S923007", "Bill", "05/11/1985",
                "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }

}