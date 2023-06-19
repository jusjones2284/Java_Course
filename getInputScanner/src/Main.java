import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        getInputFromScanner(2023);

    }

        public static String getInputFromScanner(int currentYear) {

            Scanner scanner = new Scanner(System.in);

            //String name = System.console().readLine("Hi, What's your Name? ");
            System.out.println("Hi, What's your Name? ");
            String name = scanner.nextLine();

            System.out.println("Hi" + name + ", Thanks for taking the course");

            // String dateOfBirth = System.console().readLine("What year were you born? ");
            System.out.println("What year were you born? ");
            String dateOfBirth = scanner.nextLine();

            int age = currentYear - Integer.parseInt(dateOfBirth);

            return "So you are " + age + " years old";

    }
}