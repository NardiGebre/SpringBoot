package com.Nardos.Restaurant;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
@Autowired
BooksRepository bookRepository;

public  Optional<Books> getBookByID(Long id){
return bookRepository.findById(id);
}

public Books saveBook(Books book) {
	// TODO Auto-generated method stub
	return bookRepository.save(book);
}
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);		
	}
	public Optional<Books> updateBook(Books book, Long id){
		return bookRepository.findById(id)
				.map(book1->{
					book1.setTitle(book.getTitle());
					book1.setAuthor(book.getAuthor());
					book1.setPublishedDate(book.getPublishedDate());
					return bookRepository.save(book);
				});
	}
}

