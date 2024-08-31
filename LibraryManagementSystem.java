package LibraryManagementSystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java Programming", "Author A", "ISBN12345");
        Book book2 = new Book("Data Structures", "Author B", "ISBN67890");
        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("John Doe", "123-456-7890", "MEM001");
        library.addMember(member1);

        member1.borrowBook(book1);

        // Displaying all transactions
        BorrowTransaction transaction = new BorrowTransaction(member1, book1);
        System.out.println(transaction);

        // Return book
        transaction.returnBook();
        System.out.println(transaction);
    }
}
