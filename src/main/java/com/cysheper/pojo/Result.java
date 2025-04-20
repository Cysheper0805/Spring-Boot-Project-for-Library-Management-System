package com.cysheper.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Slf4j
@lombok.Data
@lombok.ToString
public class Result {
    private String code;
    private String msg;
    private Object data;

    public Result() {
        this.code = "200";
        this.msg = "success";
    }
    public Result access() {
        this.code = "200";
        this.msg = "success";
        return this;
    }
    public Result access(String msg) {
        this.code = "200";
        this.msg = msg;
        return this;
    }
    public Result access(Book book) {
        this.code = "200";
        this.msg = "success";
        this.data = book;
        return this;
    }
    public Result access(List<Book> books) {
        this.code = "200";
        this.msg = "success";
        this.data = books;
        return this;
    }
    public Result access(Reader reader) {
        this.code = "200";
        this.msg = "success";
        this.data = reader;
        return this;
    }

    public Result fail() {
        this.code = "400";
        this.msg = "fail";
        return this;
    }

    public Result fail(String msg) {
        this.code = "400";
        this.msg = msg;
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
