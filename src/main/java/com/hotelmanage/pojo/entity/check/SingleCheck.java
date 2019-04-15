package com.hotelmanage.pojo.entity.check;

import com.hotelmanage.pojo.entity.BasePO;
import com.alibaba.fastjson.annotation.JSONField;
import com.hotelmanage.common.util.FastJsonUtil;
import java.math.BigDecimal;
import java.util.Date;

public class SingleCheck extends BasePO {
    @JSONField(name = "check_id")
    int check_id;

    @JSONField(name = "name")
    String name;

    @JSONField(name = "room_id")
    int room_id;

    @JSONField(name = "checkintime",format = "yyyy-MM-dd HH:mm")
    Date checkintime;

    @JSONField(name = "checkouttime",format = "yyyy-MM-dd HH:mm")
    Date checkouttime;

    @JSONField(name = "cost")
    BigDecimal cost;

    @JSONField(name = "status")
    String status;

    @JSONField(name = "identity")
    String identity;

    @JSONField(name = "sex")
    String sex;

    @JSONField(name = "tel")
    String tel;

    public int getCheck_id() {
        return check_id;
    }

    public void setCheck_id(int check_id) {
        this.check_id = check_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return FastJsonUtil.toJSONString(this);
    }
}
