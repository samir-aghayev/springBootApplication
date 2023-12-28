package az.atlacademy.bookstore.services;

import az.atlacademy.bookstore.models.Book;
import az.atlacademy.bookstore.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public Book findBookById(Long bookId) {
        return bookRepository.findById(bookId).orElseThrow();
    }

    public List<Book> allBook() {
        return bookRepository.findAll();
    }

    public int stockBookById(Long bookId) {
        return findBookById(bookId).getStock();
    }
}
