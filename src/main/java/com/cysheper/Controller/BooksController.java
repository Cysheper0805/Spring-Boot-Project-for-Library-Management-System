package com.cysheper.Controller;

import com.cysheper.Service.Impl.BooksServiceImpl;
import com.cysheper.pojo.Book;
import com.cysheper.pojo.Reader;
import com.cysheper.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@Slf4j
@RestController
public class BooksController {

    @Autowired
    BooksServiceImpl studentService;

    @RequestMapping("/get")
    public Result getAllInfo() {
        return studentService.getAllBooks();
    }

    @RequestMapping("/get/{id}")
    public Result getInfo(@PathVariable("id") Integer book_id) {
        return studentService.getBookById(book_id);
    }

    @RequestMapping("/add")
    public Result addInfo(@RequestBody Book book) {
        return studentService.addBook(book);
    }

    @RequestMapping("/delete/{id}")
    public Result deleteInfo(@PathVariable("id") Integer book_id) {
        return studentService.deleteBook(book_id);
    }

    @RequestMapping("/getReader/{id}")
    public Result getReaderInfo(@PathVariable Integer id) {
        return studentService.getReaderById(id);
    }

    @RequestMapping("/postReader")
    public Result postReaderInfo(@RequestBody Reader reader) {
        return studentService.postReader(reader);
    }

}
