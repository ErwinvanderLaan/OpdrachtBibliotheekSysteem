package book;

public class BookController {

  // Show a book
  public String showBook(long id) {
  return;
  }

  // Show titles and authors of all books
  public String showBooks() {
  return; }

  public String showBorrowedBooks(){
  };

  public String showAvailableBooks(){
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

