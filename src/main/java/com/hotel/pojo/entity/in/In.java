package com.hotel.pojo.entity.in;
import com.hotel.pojo.entity.BasePO;
import com.alibaba.fastjson.annotation.JSONField;
import com.hotel.common.util.FastJsonUtil;
import java.math.BigDecimal;
import java.util.Date;
public class In extends BasePO {
    @JSONField(name = "id")
    int id;

    @JSONField(name = "room_id")
    int room_id;

    @JSONField(name = "checkintime",format = "yyyy-MM-dd HH:mm")
    Date checkintime;

    @JSONField(name = "checkouttime",format = "yyyy-MM-dd HH:mm")
    Date checkouttime;

    @JSONField(name = "livetime")
    int livetime;

    @JSONField(name = "price")
    BigDecimal price;

    @JSONField(name = "remark")
    String remark;

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
