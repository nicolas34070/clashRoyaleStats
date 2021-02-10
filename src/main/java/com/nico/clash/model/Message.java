package com.nico.clash.model;

import java.time.LocalDateTime;

public class Message {
    private String author;
    private LocalDateTime timestamp;
    private String message;

    public Message(String author, String message){
        this.timestamp = LocalDateTime.now();
        this.author = author;
        this.message = message;
    }

    public Message() {

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
