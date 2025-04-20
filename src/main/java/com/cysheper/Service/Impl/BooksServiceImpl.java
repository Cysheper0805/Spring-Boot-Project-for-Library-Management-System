package com.cysheper.Service.Impl;

import com.cysheper.Mapper.BooksMapper;
import com.cysheper.Service.BooksService;
import com.cysheper.pojo.Book;
import com.cysheper.pojo.Reader;
import com.cysheper.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    private BooksMapper booksMapper;

    @Override
    public Result getBookById(Integer id) {
        Book book = new Book();
        try {
            book = booksMapper.getBookById(id);
        } catch (Exception e) {
            return new Result().fail("编号已存在！");
        }
        return new Result().access(book);
    }

    @Override
    public Result addBook(Book book) {
        try {
            Integer flag = booksMapper.addBook(book);
            if (flag > 0) {
                return new Result().access();
            } else {
                throw new Exception("Failed to add the book.");
            }
        } catch (Exception e) {
            return new Result().fail("编号已存在！");
        }
    }


    @Override
    public Result getAllBooks() {
        List<Book> books = new ArrayList<>();
        try {
            books = booksMapper.getAllBooks();
        } catch (Exception e) {
            return new Result().fail("Internal Server Error: " + e.getMessage());
        }
        return new Result().access(books);
    }

    @Override
    public Result deleteBook(Integer id) {
        try {
            Integer flag = booksMapper.deleteBook(id);
            if (flag > 0) {
                return new Result().access();
            } else {
                throw new Exception("Failed to delete the book.");
            }
        } catch (Exception e) {
            return new Result().fail("Internal Server Error: " + e.getMessage());
        }
    }

    @Override
    public Result getReaderById(Integer id) {
        try {
            Reader reader = booksMapper.getReaderById(id);
            return new Result().access(reader);
        } catch (Exception e) {
            return new Result().fail("Internal Server Error: " + e);
        }
    }

    @Override
    public Result postReader(Reader reader) {
        try {
            Integer flag = booksMapper.postReader(reader);
            if (flag > 0) {
                return new Result().access();
            } else {
                throw new Exception("Failed to add the reader.");
            }
        } catch (Exception e) {
            return new Result().fail("Internal Server Error: " + e.getMessage());
        }
    }
}
