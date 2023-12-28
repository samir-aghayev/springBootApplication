package az.atlacademy.bookstore.services;

import az.atlacademy.bookstore.repositories.AuthorRepository;
import org.springframework.stereotype.Service;


@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
}
