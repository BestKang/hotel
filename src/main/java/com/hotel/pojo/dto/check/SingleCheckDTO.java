package com.hotel.pojo.dto.check;

import com.alibaba.fastjson.annotation.JSONField;
import com.hotel.common.util.FastJsonUtil;
import com.hotel.pojo.dto.BasePageableDTO;
import com.hotel.pojo.entity.BasePO;

import java.math.BigDecimal;
import java.util.Date;

public class SingleCheckDTO extends BasePageableDTO {
    @JSONField(name = "check_id")
    private int check_id;

    @JSONField(name = "name")
    private String name;

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

    @JSONField(name = "identity")
    private String identity;

    @JSONField(name = "sex")
    private String sex;

    @JSONField(name = "tel")
    private String tel;

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
