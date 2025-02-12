class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    Book next, prev;

    public Book(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

class LibraryManagement {
    private Book head = null, tail = null;
    private int bookCount = 0;

    public void addBookAtEnd(int bookId, String title, String author, String genre, boolean isAvailable) {
        Book newBook = new Book(bookId, title, author, genre, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        bookCount++;
    }

    public void removeBookById(int bookId) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        Book current = head;
        while (current != null && current.bookId != bookId) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Book not found: " + bookId);
            return;
        }
        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        bookCount--;
        System.out.println("Book removed: " + bookId);
    }

    public void searchBookByTitle(String title) {
        Book current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found: " + current.title + " by " + current.author + " (Genre: " + current.genre + ", ID: " + current.bookId + ")");
                return;
            }
            current = current.next;
        }
        System.out.println("Book not found: " + title);
    }

    public void updateAvailability(int bookId, boolean newStatus) {
        Book current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                current.isAvailable = newStatus;
                System.out.println("Updated Availability for Book ID " + bookId + ": " + (newStatus ? "Available" : "Not Available"));
                return;
            }
            current = current.next;
        }
        System.out.println("Book not found: " + bookId);
    }

    public void displayAllBooks() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        Book current = head;
        while (current != null) {
            System.out.println("Book ID: " + current.bookId + ", Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", Available: " + current.isAvailable);
            current = current.next;
        }
    }

    public void displayAllBooksReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }
        Book current = tail;
        while (current != null) {
            System.out.println("Book ID: " + current.bookId + ", Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", Available: " + current.isAvailable);
            current = current.prev;
        }
    }

    public void countBooks() {
        System.out.println("Total number of books in the library: " + bookCount);
    }

    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();

        library.addBookAtEnd(1, "1984", "George Orwell", "Dystopian", true);
        library.addBookAtEnd(2, "To Kill a Mockingbird", "Harper Lee", "Fiction", true);
        library.addBookAtEnd(3, "The Great Gatsby", "F. Scott Fitzgerald", "Classic", false);

        System.out.println("All Books in Library:");
        library.displayAllBooks();

        System.out.println("Searching for '1984'...");
        library.searchBookByTitle("1984");

        System.out.println("Updating Availability of Book ID 3...");
        library.updateAvailability(3, true);

        System.out.println("Displaying Books in Reverse Order:");
        library.displayAllBooksReverse();

        System.out.println("Counting Books...");
        library.countBooks();

        System.out.println("Removing Book ID 2...");
        library.removeBookById(2);

        System.out.println("Final Library Collection:");
        library.displayAllBooks();
    }
}
