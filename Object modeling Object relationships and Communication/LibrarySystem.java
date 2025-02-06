import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public void displayBook(){
        System.out.println("Book: " + title + " by " + author);
    }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibrary() {
        System.out.println("Library: " + name);
        System.out.println("Books in Library:");
        for (Book book : books) {
            book.displayBook();
        }
        System.out.println();
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        Library cityLibrary = new Library("City Library");
        Library universityLibrary = new Library("University Library");

        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        universityLibrary.addBook(book2); 
        universityLibrary.addBook(book3);

        cityLibrary.displayLibrary();
        universityLibrary.displayLibrary();
    }
}
