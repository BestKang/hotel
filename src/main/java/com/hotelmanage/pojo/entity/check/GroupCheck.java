package com.hotelmanage.pojo.entity.check;

import com.hotelmanage.pojo.entity.BasePO;
import com.alibaba.fastjson.annotation.JSONField;
import com.hotelmanage.common.util.FastJsonUtil;
import java.math.BigDecimal;
import java.util.Date;

public class GroupCheck extends BasePO {
    @JSONField(name = "check_id")
    int check_id;

    @JSONField(name = "group_id")
    int group_id;

    @JSONField(name = "group_name")
    String group_name;

    @JSONField(name = "num")
    int num;

    @JSONField(name = "cost")
    BigDecimal cost;

    @JSONField(name = "tel")
    String tel;

    /*@JSONField(name = "room_id")
    int room_id;*/

    @JSONField(name = "checkintime",format = "yyyy-MM-dd HH:mm")
    Date checkintime;

    @JSONField(name = "checkouttime",format = "yyyy-MM-dd HH:mm")
    Date checkouttime;

    @JSONField(name = "status")
    String status;

   /* @JSONField(name = "identity")
    String identity;

    @JSONField(name = "sex")
    String sex;*/

    public int getCheck_id() {
        return check_id;
    }

    public void setCheck_id(int check_id) {
        this.check_id = check_id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return FastJsonUtil.toJSONString(this);
    }
}
