class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie next;
    Movie prev;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieManagementSystem {
    private Movie head;
    private Movie tail;

    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    public void removeMovieByTitle(String title) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                System.out.println("Movie removed: " + title);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found: " + title);
    }

    public void searchByDirector(String director) {
        Movie current = head;
        boolean found = false;
        while (current != null) {
            if (current.director.equalsIgnoreCase(director)) {
                System.out.println(current.title + " (" + current.year + ") - Rating: " + current.rating);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No movies found by director: " + director);
    }

    public void searchByRating(double rating) {
        Movie current = head;
        boolean found = false;
        while (current != null) {
            if (current.rating == rating) {
                System.out.println(current.title + " (" + current.year + ") - Directed by: " + current.director);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No movies found with rating: " + rating);
    }

    public void displayMoviesForward() {
        Movie current = head;
        if (current == null) {
            System.out.println("No movies in the list.");
            return;
        }
        while (current != null) {
            System.out.println(current.title + " (" + current.year + ") - " + current.director + " - Rating: " + current.rating);
            current = current.next;
        }
    }

    public void displayMoviesReverse() {
        Movie current = tail;
        if (current == null) {
            System.out.println("No movies in the list.");
            return;
        }
        while (current != null) {
            System.out.println(current.title + " (" + current.year + ") - " + current.director + " - Rating: " + current.rating);
            current = current.prev;
        }
    }

    public void updateMovieRating(String title, double newRating) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println("Updated rating of " + title + " to " + newRating);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found: " + title);
    }

    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();
        
        mms.addMovieAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        mms.addMovieAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        mms.addMovieAtEnd("Titanic", "James Cameron", 1997, 7.8);
        
        System.out.println("Movies in Forward Order:");
        mms.displayMoviesForward();

        System.out.println("Movies in Reverse Order:");
        mms.displayMoviesReverse();

        System.out.println("Searching for movies by Christopher Nolan:");
        mms.searchByDirector("Christopher Nolan");

        System.out.println("Updating rating for Titanic...");
        mms.updateMovieRating("Titanic", 8.0);
        
        System.out.println("Removing Inception...");
        mms.removeMovieByTitle("Inception");

        System.out.println("Final Movie List:");
        mms.displayMoviesForward();
    }
}
