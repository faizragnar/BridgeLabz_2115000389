import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name = "Author Name")
class Book {}

public class RetrieveAnnotation {
    public static void main(String[] args) {
        Class<Book> obj = Book.class;
        if (obj.isAnnotationPresent(Author.class)) {
            Author author = obj.getAnnotation(Author.class);
            System.out.println(author.name());
        }
    }
}
