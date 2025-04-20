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
        Result result = studentService.getAllBooks();
        if (result.getCode().equals("200")) {
            return result;
        } else {
            return result;
        }
    }

    @RequestMapping("/get/{id}")
    public Result getInfo(@PathVariable("id") Integer book_id) {
        Result result = studentService.getBookById(book_id);
        if (result.getCode().equals("200")) {
            return result;
        } else {
            return result;
        }
    }

    @RequestMapping("/add")
    public Result addInfo(@RequestBody Book book) {
        Result result = studentService.addBook(book);
        if (result.getCode().equals("200")) {
            return result;
        } else {
            return result;
        }
    }

    @RequestMapping("/delete/{id}")
    public Result deleteInfo(@PathVariable("id") Integer book_id) {
        Result result = studentService.deleteBook(book_id);
        if (result.getCode().equals("200")) {
            return result;
        } else {
            return result;
        }
    }

    @RequestMapping("/getReader/{id}")
    public Result getReaderInfo(@PathVariable Integer id) {
        return studentService.getReaderById(id);
    }

    @RequestMapping("/postReader")
    public Result postReaderInfo(@RequestBody Reader reader) {
        Result result = studentService.postReader(reader);
        if (result.getCode().equals("200")) {
            return result;
        } else {
            return result;
        }
    }

}
