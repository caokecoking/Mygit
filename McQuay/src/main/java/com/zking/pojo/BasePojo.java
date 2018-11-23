package com.zking.pojo;

public class BasePojo {
    private int page;
    private int rows;
    private String startTime;
    private String endTime;

    public BasePojo() {
    }

    public BasePojo(int page, int rows, String startTime, String endTime) {
        this.page = page;
        this.rows = rows;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
