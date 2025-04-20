package com.cysheper.Service;

import com.cysheper.pojo.Book;
import com.cysheper.pojo.Reader;
import com.cysheper.pojo.Result;

public interface BooksService {
    public Result getBookById(Integer id);

    public Result addBook(Book book);

    public Result getAllBooks();

    public Result deleteBook(Integer id);

    public Result getReaderById(Integer id);

    public Result postReader(Reader reader);
}
