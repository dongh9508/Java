package java_extend.Sample.HW_iterator_1;

import java.util.*;

public class BookShelf implements Iterable<Book> {
    List<Book> bookShelfList;
    public BookShelf(List<Book> bookList){ this.bookShelfList=bookList; }
    @Override
    public Iterator iterator() {
        return bookShelfList.iterator();
    }
}
