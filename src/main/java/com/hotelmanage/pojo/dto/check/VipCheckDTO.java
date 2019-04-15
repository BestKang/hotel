package com.hotelmanage.pojo.dto.check;

import com.alibaba.fastjson.annotation.JSONField;
import com.hotelmanage.common.util.FastJsonUtil;
import com.hotelmanage.pojo.dto.BasePageableDTO;

import java.math.BigDecimal;
import java.util.Date;

public class VipCheckDTO extends BasePageableDTO {
    @JSONField(name = "order_id")
    private int order_id;

    @JSONField(name = "user_id")
    private int user_id;

    @JSONField(name = "room_id")
    private int room_id;

    @JSONField(name = "checkintime",format = "yyyy-MM-dd HH:mm")
    private Date checkintime;

    @JSONField(name = "checkouttime",format = "yyyy-MM-dd HH:mm")
    private Date checkouttime;

    @JSONField(name = "cost")
    private BigDecimal cost;

    @JSONField(name = "status")
    private String status;

    @JSONField(name = "deposit")
    private BigDecimal deposit;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public Date getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(Date checkintime) {
        this.checkintime = checkintime;
    }

    public Date getCheckouttime() {
        return checkouttime;
    }

    public void setCheckouttime(Date checkouttime) {
        this.checkouttime = checkouttime;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return FastJsonUtil.toJSONString(this);
    }
}
