package java_extend.Sample.HW_iterator;

import java.util.*;

class Book {
    private String name;
    public Book(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

public class BookShelfListAnonym {
    abstract static class BookShelf implements Iterable<Book> {
        BookShelf(List list) {}
        public Iterator iterator() {
            return null;
        }
    }
    public static void main(String[] args) {
        List<Book> bookList
                = Arrays.asList(new Book("Around the World in 80 Days"),
                new Book("Bible"),
                new Book("Cinderella"),
                new Book("Daddy-Long-Legs"));

        BookShelf bookShelf = new BookShelf(bookList) {
            @Override
            public Iterator iterator() {
               return bookList.iterator();
            }
        };

        for(Book book: bookShelf){
            System.out.println(book.getName());
        }

    }

}

