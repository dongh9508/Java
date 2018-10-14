package java_extend.Sample.HW_iterator_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList
                = Arrays.asList(new Book("Around the World in 80 Days"),
                new Book("Bible"),
                new Book("Cinderella"),
                new Book("Daddy-Long-Legs"));

        BookShelf bookShelf = new BookShelf(bookList);
        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }

        System.out.println();

        for(Book book: bookShelf){
            System.out.println(book.getName());
        }
    }
}
