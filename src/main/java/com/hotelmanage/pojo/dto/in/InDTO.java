package com.hotelmanage.pojo.dto.in;

import com.alibaba.fastjson.annotation.JSONField;
import com.hotelmanage.common.util.FastJsonUtil;
import com.hotelmanage.pojo.dto.BasePageableDTO;

import java.math.BigDecimal;
import java.util.Date;

public class InDTO extends BasePageableDTO {
    @JSONField(name = "id")
    private int id;

    @JSONField(name = "room_id")
    private int room_id;

    @JSONField(name = "checkintime",format = "yyyy-MM-dd HH:mm")
    private Date checkintime;

    @JSONField(name = "checkouttime",format = "yyyy-MM-dd HH:mm")
    private Date checkouttime;

    @JSONField(name = "livetime")
    private int livetime;

    @JSONField(name = "price")
    private BigDecimal price;

    @JSONField(name = "remark")
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getLivetime() {
        return livetime;
    }

    public void setLivetime(int livetime) {
        this.livetime = livetime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return FastJsonUtil.toJSONString(this);
    }
}
