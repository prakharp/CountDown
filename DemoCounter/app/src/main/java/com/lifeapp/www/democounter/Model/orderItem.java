package com.lifeapp.www.democounter.Model;

import android.os.CountDownTimer;
import android.widget.TextView;

/**
 * Created by Prakhar on 12/30/2016.
 */

public class orderItem {
    private int order_id;
    private long countDown;
    private String orderName;
    private long startTime;
    private long endTime;


    public orderItem(int order_id, String orderName, long startTime, long endTime) {
        this.order_id = order_id;
        this.orderName = orderName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.countDown=startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getStartTime() {

        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }


    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }


    public long getCountDown() {
        return countDown;
    }

    public void setCountDown(long countDown) {
        this.countDown = countDown;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public long getEndTime() {
        return endTime;
    }

}
