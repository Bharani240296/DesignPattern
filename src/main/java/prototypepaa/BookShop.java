package prototypepaa;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String bookShopName;
    private List<Book> bookList=new ArrayList<Book>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String getBookShopName() {
        return bookShopName;
    }

    public void setBookShopName(String bookShopName) {
        this.bookShopName = bookShopName;
    }
    public void addBook(){
        for (int j=1;j<=10;j++){
            Book book=new Book();
            book.setBookId(j);
            book.setBookName("book"+j);
            getBookList().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "bookShopName='" + bookShopName + '\'' +
                ", bookList=" +bookList +
                '}';
    }
}
