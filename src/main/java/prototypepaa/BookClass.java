package prototypepaa;

public class BookClass {
    public static void main(String[] args) {
        BookShop bookShop = new BookShop();
        bookShop.setBookShopName("Shanmuga");
        bookShop.addBook();
        System.out.println(bookShop);
        bookShop.getBookList().remove(2);
        System.out.println(bookShop);
        //BookShop bookShop2 = bookShop.clone();
    }
}
