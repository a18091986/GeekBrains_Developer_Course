package seminars.fourth.book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.*;

class BookServiceTest {
    private static class FakeBookRepository implements BookRepository {
        private final Map<String, Book> books;

        public FakeBookRepository() {
            this.books = new HashMap<>();
            books.put("1", new Book("1", "Book1", "Author1"));
            books.put("2", new Book("2", "Book2", "Author2"));
        }

        @Override
        public Book findById(String id) {
            return books.get(id);
        }

        @Override
        public List<Book> findAll() {
            return new ArrayList<>(books.values());
        }
    }

    @Test
    void testFindBookById() {
        // Создание экземпляра класса BookService с использованием класса FakeBookRepository
        BookService bookService = new BookService(new FakeBookRepository());

        // Вызов метода findBookById
        Book result = bookService.findBookById("1");

        // Проверка результата
        Assertions.assertEquals(new Book("1", "Book1", "Author1"), result);
    }

    @Test
    void testFindAllBooks() {
        // Создание экземпляра класса BookService с использованием класса FakeBookRepository
        BookService bookService = new BookService(new FakeBookRepository());

        // Вызов метода findAllBooks
        List<Book> result = bookService.findAllBooks();

        // Проверка результата
        Assertions.assertEquals(Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        ), result);
    }
}
