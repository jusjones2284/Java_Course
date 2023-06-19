import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        Movie theMovie = new Movie("Star Wars");
//        theMovie.watchMovie();
//
//        Movie theMovies = new Adventure("Star Wars");
//        theMovies.watchMovie();
//
//        Movie theMovieo = new Movie("Star Wars");
//        theMovieo.watchMovie();
//
//        Movie theMoviess = Movie.getMovie("Adventure", "Star Wars" );

//        Movie theMovie = Movie.getMovie("Horror", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
                    String type = s.nextLine();
                    if("Qq".contains(type)){
                        break;
                    }
                    System.out.print("Enter Movie Title: ");
                    String title = s.nextLine();
                    Movie movie = Movie.getMovie(type, title);
                    movie.watchMovie();
        }




    }
}

