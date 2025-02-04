class Book{
		static String LibraryName= "hello books";
		private final String isbn ;
		private String title;
		private String author;
		
		public Book(String isbn, String title,String author){
			this.isbn=isbn;
			this.title=title;
			this.author=author;
		}
		public static void displayLibraryName(){
			System.out.println(LibraryName);
		}
		public void display(){
			if(this instanceof Book){
				System.out.println("isbn number - " + isbn);
				System.out.println("Title of the book - " + title);
				System.out.println("Author - " +author);
			}
			
		}
	
}

public class LibraryManagement{
	public static void main(String[] args){
		Book b1 = new Book("5671457251875","Harry potter","j.k rowling");
		Book b2 = new Book("4587236286323","Game of thrones","George R.R martin");
		
		Book.displayLibraryName();
		b1.display();
		b2.display();

	}
}