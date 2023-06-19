public class Main {
    public static void main(String[] args) {

        String helloWorld = "Hello " + "World";
        String jus = helloWorld.concat(" and Goodbye ");
        //When we passed the String literal, and Goodbye, to the concat method, this
        //created an Object in memory for that literal, and goodbye. you have to assign to a varable.

        StringBuilder helloWorldBuilder = new StringBuilder("Hello " + "World");
        helloWorldBuilder.append(" and Goodbye");

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));
        //String builder starts with the capacity of 16

        printInFormation(helloWorld);
        printInformation(helloWorldBuilder);
        printInFormation(jus);

        StringBuilder builderPlus = new  StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        //chaining methods
        System.out.println(builderPlus);

        builderPlus.replace(16,20, "Just");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);

    }

    //String methods create a new object in memory, and return a reference to this new object.
    //StringBuilder methods return a StringBuilder reference, but it's really a self-reference.

    public static void printInFormation(String string) {

        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }


    public static void printInformation(StringBuilder builder) {

        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());

    }
}