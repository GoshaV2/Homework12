import models.Author;
import models.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(5);
        Author author1 = new Author("Аноним", "Не придумал");
        Author author2 = new Author("Джоан", "Роулинг");
        library.addBook("Винипух", author1, 2003);
        library.addBook("Гарри Поттер часть 1", author2, 1980);
        library.addBook("Гарри Поттер часть 2", author2, 1980);
        library.addBook("Гарри Поттер часть 3", author2, 1980);
        library.printInfoOfBook("Винипух");
        library.updateYearPublished("Винипух", 1900);
        library.printInfoOfBook("Винипух");
        library.printAllInfoOfBooks();
    }
}