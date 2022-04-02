package com.interview.databricks.own;

public class Events {

    private int levelId;
    private int startTime;
    private int recurringInterval;

    public Events(){

    }

    public Events(int levelId, int startTime, int recurringInterval) {
        this.levelId = levelId;
        this.startTime = startTime;
        this.recurringInterval = recurringInterval;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getRecurringInterval() {
        return recurringInterval;
    }

    public void setRecurringInterval(int recurringInterval) {
        this.recurringInterval = recurringInterval;
    }
}
