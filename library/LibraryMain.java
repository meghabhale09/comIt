package library;

import java.util.ArrayList;
import java.util.List;

public class LibraryMain {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"Java","Kathy",5));
        books.add(new Book(2,"Java","Herbert",3));
        books.add(new Book(3,"C","Hrishikesh",1));
        books.add(new Book(4,"C","Balaguruswamy",4));

        for (Book book:books) {
            isAvailable(book,"java", "kathy");
            isAvailable(book,"c", "hrishikesh");
        }
    }

    public static void isAvailable(Book book, String bookName, String AuhorName) {
        if (book.getBookTitle().toLowerCase().equalsIgnoreCase(bookName)
                && book.getAuhorName().toLowerCase().equalsIgnoreCase(AuhorName)) {
            System.out.println(book.loanBook());
            System.out.println(book.getLendCopies());
            System.out.println(book.getTotalCopies());
        }
    }
}
