package com.hotelmanage.pojo.entity.room;

import com.hotelmanage.pojo.entity.BasePO;
import com.alibaba.fastjson.annotation.JSONField;
import com.hotelmanage.common.util.FastJsonUtil;
import java.math.BigDecimal;

public class Room extends BasePO{
    @JSONField(name = "room_id")
    int room_id;

    @JSONField(name = "room_name" )
    String room_name;

    @JSONField(name = "room_type")
    String room_type;

   /* @JSONField(name = "checkintime",format = "yyyy-MM-dd HH:mm")
    Date checkintime;

    @JSONField(name = "checkouttime",format = "yyyy-MM-dd HH:mm")
    Date checkouttime;*/

    @JSONField(name = "bed_type")
    String bed_type;

    @JSONField(name = "room_pic")
    String room_pic;

    @JSONField(name = "room_price")
    BigDecimal room_price;

    @JSONField(name = "room_status")
    String room_status;

    @JSONField(name = "room_detail")
    String room_detail;

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getBed_type() {
        return bed_type;
    }

    public void setBed_type(String bed_type) {
        this.bed_type = bed_type;
    }

    public String getRoom_pic() {
        return room_pic;
    }

    public void setRoom_pic(String room_pic) {
        this.room_pic = room_pic;
    }

    public BigDecimal getRoom_price() {
        return room_price;
    }

    public void setRoom_price(BigDecimal room_price) {
        this.room_price = room_price;
    }

    public String getRoom_status() {
        return room_status;
    }

    public void setRoom_status(String room_status) {
        this.room_status = room_status;
    }

    public String getRoom_detail() {
        return room_detail;
    }

    public void setRoom_detail(String room_detail) {
        this.room_detail = room_detail;
    }

    @Override
    public String toString() {
        return FastJsonUtil.toJSONString(this);
    }
}
