public class Main {
    public static void main(String[] args) {
        String s = new String("hello");
        System.out.println(s);

        int currentYear = 2023;
        String usersDateOfBirth = "1984";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));

        String usersAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        double jus = 20;
        System.out.println("The user says he's " + (jus + ageWithPartialYear));

        String userAgeWithPartialYear = "30.6";
        double agesWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);

        getInputFromConsole(2023);




    }

    public static String getInputFromConsole(int currentYear) {


        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
         int ages = currentYear - Integer.parseInt(dateOfBirth);

         return "So you are " + ages + " years old";

    }

    public static String getInputFromConsoles(int currentYear) {

        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are" + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {

        return "";

    }


    //Static Field
    //Requires 'static' keyword when declared on the class.
    //value of the field is stored in special memory location and
    //only in one place.
    //Value is accessed by ClassName.fieldname
    //Instance Field
    //omits 'static' keyword when declared on the class
    //Value of the field is not allocated any memory and has no value until object is created.
    //Static Method -  requires 'static' keyword when declared on the class.
    //Method is accessed by ClassName.methodName
    //Integer.parseInt("123");
    //A method called parseInt is called directly from Class, Integer
    //Instance Method
    //omits 'static' keyword when declared on the class.
    //Method is accessed by ObjectVariable.methodName
    //  "hello".toUpperCase();
    //A method called to UpperCase is called on the instance of a String with the value "hello"
    //Wrapper Wrapper Method
    //Integer parseInt(String)
    //Double  parseDouble(String)

    //The try statement actually has two code blocks.
    //the first is declared directly after the keyword, and this code block ends,
    //and is followed by the declaration of the catch keyword
    //the catch keyword includes the declaration of variables, in parentheses, and
    //has its own code block

    //new keyword is used in what java calls, class instane creation expression.
    //ClassName variableName = new ClassName();
    //ClassName variableName = new ClassName(argument1, argument2);

}