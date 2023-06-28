package com.javafundamentals.apiusers.common.exception;

import org.springframework.http.HttpStatus;

import java.util.ArrayList;

public class MyException extends Exception{
    private ArrayList<String> messages = new ArrayList<>();
    private Integer code;
    private HttpStatus code2;

    public MyException(ArrayList<String> messages, Integer code){
        super();
        this.messages = messages;
        this.code = code;
    }

    public MyException(String messages, Integer code){
        super();
        this.messages.add(messages);
        this.code = code;
    }

    public MyException(ArrayList<String> messages, HttpStatus code2){
        super();
        this.messages = messages;
        this.code2 = code2;
    }

    public MyException(String messages, HttpStatus code2){
        super();
        this.messages.add(messages);
        this.code2 = code2;
    }



    // Getter
    public ArrayList<String> getMessages() {
        return messages;
    }

    public Integer getCode() {
        return code;
    }

    public HttpStatus getCode2() {
        return code2;
    }

}
