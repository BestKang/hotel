package com.hotel.pojo.entity.admin;
import com.alibaba.fastjson.annotation.JSONField;
import com.hotel.common.util.FastJsonUtil;
import com.hotel.pojo.entity.BasePO;
import java.util.Date;
public class Admin extends BasePO{
    @JSONField(name = "id")
    int id;

    @JSONField(name = "pw")
    String pw;

    @JSONField(name = "name")
    String name;

    @JSONField(name = "pos")
    String pos;

    /*@JSONField(name = "cop_sex")
    String copSex;

    @JSONField(name = "birthday",format = "yyyy-MM-dd HH:mm:ss")
    Date birthday;

    @JSONField(name = "flag")
    int flag;

    @JSONField(name = "manage_area")
    String manageArea;

    @JSONField(name = "finish_status")
    String finishStatus;*/

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
