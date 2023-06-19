public class Movie {

    private String title;
    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        //.getClass() is the method of Object class. this method returns the runtime class of this object.
        //.getSimpleName() returns the simple name of the underlying class given in the source code.
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    //the constructors are used to initialize the instance variable of a class or create objects.
    //the setter/getter methods are used to assign/change and retrieve values of the instance variables
    //of a class.
    //
     public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}



class Adventure extends Movie {

    public Adventure(String title) {
        super(title);

    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad happens"
        );
    }
}

class Comedy extends Movie {

    //Constructor
    public Comedy(String title) {
        super(title);

    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Scary Music",
                "Happy Ending"
        );
    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);

    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up"
        );
    }
}

