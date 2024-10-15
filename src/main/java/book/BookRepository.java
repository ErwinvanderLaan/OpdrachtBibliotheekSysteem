package book;

import java.util.ArrayList;

import static main.Main.askForInput;

public class BookRepository {


    ArrayList<Book> books;

// The methods

    // The constructor.
    public BookRepository(){
        books = new ArrayList<>();
    }

    // Add a book
    public void addBook(){
        Book book = new Book (
        Integer.parseInt(askForInput("Enter the ID number: \n")),
        askForInput("Enter the title of the book: \n"),
        askForInput("Enter the name of the author: \n"),
        Integer.parseInt(askForInput("Enter the number of pages the book has: \n")),
        askForInput("Enter the ISBN: \n")
        );
        books.add(book);
    }

    // Remove a book
    public void removeBook(long id){
        for(Book book : books)
            if (book.getId() == id)
                books.remove(book);
    }
}
