class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {

        Book book1 = new Book("Game of thrones", "George R. R. Martin", 10.99);
        Book book2 = new Book("Harry potter", "J.K Rowling", 8.99);

        System.out.println("Book 1 Details:");
        book1.displayDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayDetails();
    }
}
