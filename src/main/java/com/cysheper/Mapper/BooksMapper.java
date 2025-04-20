package com.cysheper.Mapper;


import com.cysheper.pojo.Book;
import com.cysheper.pojo.Reader;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BooksMapper {

    @Select("select * from book where book_id = #{id}")
    Book getBookById(Integer id);

    @Insert("insert into book(book_id,name,price,author,exist,reader) values(#{book_id},#{name},#{price},#{author},#{exist},#{reader})")
    Integer addBook(Book book);

    @Select("select * from book")
    List<Book> getAllBooks();

    @Delete("delete from book where book_id = #{id}")
    Integer deleteBook(Integer id);

    @Select("select * from reader where id = #{id}")
    Reader getReaderById(Integer id);

    @Insert("insert into reader(id,name,gender) values(#{id},#{name},#{gender})")
    Integer postReader(Reader reader);
}
