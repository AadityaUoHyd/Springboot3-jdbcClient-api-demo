package org.aadi.jdbcClient.controller;

import org.aadi.jdbcClient.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private JdbcClient jdbcClient;

    @PostMapping
    public String addNewBook(@RequestBody Book book) {
        jdbcClient.sql("INSERT INTO book(id,name,title) values(?,?,?)")
                .params(List.of(book.getId(),book.getName(),book.getTitle()))
                .update();
        return "book added to the system";
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return jdbcClient.sql("SELECT id, name, title FROM book")
                .query(Book.class)
                .list();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable int id) {
        return jdbcClient.sql("SELECT id, name, title FROM book where id=:id")
                .param("id", id)
                .query(Book.class).optional();
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable int id, @RequestBody Book book) {
        jdbcClient
                .sql("update book set title = ?, name = ? where id = ?")
                .params(List.of(book.getTitle(),book.getName(),id))
                .update();
        return "book modified in system";
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        jdbcClient.sql("delete from book where id=:id")
                .param("id", id)
                .update();
        return "book record removed !";
    }


}
