import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library(2);
        book = new Book("The Lord of the Rings", "J. R. R. Tolkien", "fantasy");
        book2 = new Book("The Lion, the Witch and the Wardrobe", "C. S. Lewis", "fantasy");
        book3 = new Book("The Da Vinci Code", "Dan Brown", "mystery thriller");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBook(){
        library.addBook(book);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void testCapacity(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.bookCount());

    }
}
