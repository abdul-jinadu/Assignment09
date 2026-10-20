/**
 * Name:
 * Date:
 */
public class Assignment9 {

    public static void main(String[] args) {
        MovieTracker tracker = new MovieTracker();

        // Create a few movies
        Movie inception = new Movie("Inception", 148, 2010, "PG-13");
        Movie up = new Movie("Up", 96,  2009, "PG");
        Movie jaws = new Movie("Jaws", 124, 1975, "PG");
        Movie matrix = new Movie("The Matrix", 136, 1999, "R");
        Movie frozen = new Movie("Frozen", 102, 2013, "PG");

        // Record which movies each user has watched
        tracker.addMovie("alice", inception);
        tracker.addMovie("alice", up);
        tracker.addMovie("alice", matrix);

        tracker.addMovie("bob", jaws);
        tracker.addMovie("bob", matrix);

        tracker.addMovie("abdul", frozen);
        tracker.addMovie("abdul", up);

        // getMovies returns the set of movies for one user
        System.out.println("=== getMovies ===");
        System.out.println("alice: " + tracker.getMovies("alice"));
        System.out.println("bob: " + tracker.getMovies("bob"));
        System.out.println("abdul: " + tracker.getMovies("abdul"));

        System.out.println("=== hasWatched ===");
        System.out.println("alice watched Inception? " + tracker.hasWatched("alice", inception));
        System.out.println("alice watched Jaws? " + tracker.hasWatched("alice", jaws));
        System.out.println("bob watched The Matrix? " + tracker.hasWatched("bob", matrix));
        System.out.println("abdul watched Frozen? " + tracker.hasWatched("abdul", frozen));

        Movie anotherUp = new Movie("Up", 96, 2009, "PG");
        System.out.println("abdul has watched an equal copy of Up? " + tracker.hasWatched("abdul", anotherUp));

        System.out.println("=== Duplicate Movies ===");
        System.out.println("alice before adding duplicates: " + tracker.getMovies("alice") + " (size " + tracker.getMovies("alice").size() + ")");
        tracker.addMovie("alice", inception);
        tracker.addMovie("alice", anotherUp);
        System.out.println("alice after adding duplicates: " + tracker.getMovies("alice") + " (size " + tracker.getMovies("alice").size() + ")");
    }
}
