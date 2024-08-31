package LibraryManagementSystem;
import java.util.*;

public class Member extends Person {
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    public Member(String name, String contact, String memberId) {
        super(name, contact);
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId(){
        return this.memberId;
    }
    public void borrowBook(Book book) {
        book.borrowBook();
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        book.returnBook();
        borrowedBooks.remove(book);
    }

    
}
