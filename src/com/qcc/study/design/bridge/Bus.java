package com.qcc.study.design.bridge;

import java.sql.Time;
import java.util.Date;

/**
 * @author: qiancc
 * 2017年07月19日
 */
public class Bus {
    private String operation;
    private String status;
    private Date create_date;
    private Time create_time;
    private Time last_up_time;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Time getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Time create_time) {
        this.create_time = create_time;
    }

    public Time getLast_up_time() {
        return last_up_time;
    }

    public void setLast_up_time(Time last_up_time) {
        this.last_up_time = last_up_time;
    }

    public Bus() {
    }

    public Bus(String operation, String status, Date create_date, Time create_time, Time last_up_time) {

        this.operation = operation;
        this.status = status;
        this.create_date = create_date;
        this.create_time = create_time;
        this.last_up_time = last_up_time;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "operation='" + operation + '\'' +
                ", status='" + status + '\'' +
                ", create_date=" + create_date +
                ", create_time=" + create_time +
                ", last_up_time=" + last_up_time +
                '}';
    }
}
