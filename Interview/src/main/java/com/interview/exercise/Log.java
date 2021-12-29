package com.interview.exercise;

import java.sql.Timestamp;

public class Log {

    private int id;
    private String url;
    private Timestamp date;

    public Log(int id, String url, Timestamp date) {
        this.id = id;
        this.url = url;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
