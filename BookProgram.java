class Book {
    private int bookId;
    private String bookTitle;
    private String bookAuthor;

    public Book(int bookId, String bookTitle, String bookAuthor) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
}

public class BookProgram {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Complete reference", "James Gosling");
        Book b2 = new Book(102, "C Programming", "Denise Richie");
        Book b3 = new Book(103, "Python Programming", "Guido");

        Book[] booksArray = {b1,b2,b3};

        for (Book book : booksArray) {
            System.out.println("ID - "+book.getBookId());
            System.out.println("TITLE - "+book.getBookTitle());
            System.out.println("AUTHOR - "+book.getBookAuthor());
            System.out.println("--------------------------------");
        }
    }
}
