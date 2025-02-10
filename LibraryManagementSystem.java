abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Book "" + getTitle() + "" has been reserved.");
        } else {
            System.out.println("Book "" + getTitle() + "" is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

class Magazine extends LibraryItem {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 5;
    }

    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("DVD "" + getTitle() + "" has been reserved.");
        } else {
            System.out.println("DVD "" + getTitle() + "" is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book(101, "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine(102, "National Geographic", "NatGeo Team");
        LibraryItem dvd = new DVD(103, "Inception", "Christopher Nolan");

        book.getItemDetails();
        magazine.getItemDetails();
        dvd.getItemDetails();

        Reservable reservableBook = (Book) book;
        reservableBook.reserveItem();
        System.out.println("Book availability: " + reservableBook.checkAvailability());

        Reservable reservableDVD = (DVD) dvd;
        reservableDVD.reserveItem();
        System.out.println("DVD availability: " + reservableDVD.checkAvailability());
    }
}
