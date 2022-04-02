package com.interview.databricks.own;

public class Commands {

    private String type;
    private int timestamp;
    private int eventid;

    public Commands() {
    }

    public Commands(String type, int timestamp, int eventid) {
        this.type = type;
        this.timestamp = timestamp;
        this.eventid = eventid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }
}
