package LibraryManagementSystem;
import java.util.*;

public class BorrowTransaction {
    private Member member;
    private Book book;
    private Date borrowDate;
    private Date returnDate;

    public BorrowTransaction(Member member, Book book) {
        this.member = member;
        this.book = book;
        this.borrowDate = new Date();
        this.returnDate = null;
    }

    public void returnBook() {
        this.returnDate = new Date();
        book.returnBook();
    }

    @Override
    public String toString() {
        return "BorrowTransaction{" + "member=" + member.getName() + ", book=" + book.getTitle() + ", borrowDate="
                + borrowDate + ", returnDate=" + returnDate + '}';
    }
}
