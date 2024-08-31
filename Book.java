package LibraryManagementSystem;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    // Getters and Setters

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            throw new BookNotAvailableException("Book is currently unavailable.");
        }
    }

    public void returnBook() {
        isAvailable = true;
    }

    public String getTitle() {
        
        return this.title;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", isbn='" + isbn + '\''
                + ", isAvailable=" + isAvailable + '}';
    }
}
