package com.Nardos.Restaurant;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BooksController {
	@Autowired
	BooksService booksService;

	@GetMapping("/{id}")
	public ResponseEntity<Books> getBook(@PathVariable("id") long id) {
		Optional<Books> book = booksService.getBookByID(id);
		return book.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@PostMapping
	public Books SaveBook(@RequestBody Books book) {
		System.out.println("books");
		return booksService.saveBook(book);
	}

	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable("id") Long id) {
		// booksService.deletebook(id);
	}

	@PutMapping("/{id}")
	public Optional<Books> updateBook(@RequestBody Books book, @PathVariable("id") Long id) {
		System.out.println("Book info" + book);
		System.out.println("book id " + id);
		return booksService.updateBook(book, id);

	}
}
