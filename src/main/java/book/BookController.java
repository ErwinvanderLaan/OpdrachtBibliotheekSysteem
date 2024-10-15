package book;

public class BookController {

    // Show a book
    public String showBook(long id) {
        for(Book book : books)
            if (book.getId() == id)
                return book.getTitleWithAuthor();
        return "Id not found";
    }

    // Show titles and authors of all books
    public String showBooks() {
        for (Book book : books) {
            System.out.println(book.getTitleWithAuthor());
        }
        return "Id not found";
    }
    public String showBorrowedBooks(){
        for(Book book : books)
            if (book.hasBeenBorrowed() )
                System.out.println(book.getTitleWithAuthor());
        return "List of borrowed books is complete";
    }

    public String showAvailableBooks(){
        for(Book book : books)
            if (!book.hasBeenBorrowed() )
                System.out.println(book.getTitleWithAuthor());
        return "List of available books is complete";
    }

    // Set the borrowed status to true
    public void borrowBook(long id) {
        for(Book book : books)
            if (book.getId() == id)
                book.borrowBook();
    }

    // Set the borrowed status to true
    public void returnBook(long id) {
        for (Book book : books)
            if (book.getId() == id)
                book.returnBook();
    }
}


