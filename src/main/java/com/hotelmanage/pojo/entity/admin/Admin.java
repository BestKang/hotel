package com.hotelmanage.pojo.entity.admin;
import com.alibaba.fastjson.annotation.JSONField;
import com.hotelmanage.common.util.FastJsonUtil;
import com.hotelmanage.pojo.entity.BasePO;

public class Admin extends BasePO{
    @JSONField(name = "id")
    int id;

    @JSONField(name = "name")
    String name;

    @JSONField(name = "pw")
    String pw;



    @JSONField(name = "pos")
    String pos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return FastJsonUtil.toJSONString(this);
    }
}
