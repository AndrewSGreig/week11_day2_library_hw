
import java.util.ArrayList;

public class Library {
   private ArrayList<Book> books;
   private int capacity;

   public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
   }

    public int bookCount() {
        return books.size();
    }

    public void addBook(Book book){
       if (books.size() < capacity) {
           this.books.add(book);
       }else {
           System.out.println("unable to add book library capacity reached");
       }
    }



}


