package com.hotel.pojo.dto.admin;
import com.alibaba.fastjson.annotation.JSONField;
import com.hotel.common.util.FastJsonUtil;
import com.hotel.pojo.dto.BasePageableDTO;


public class AdminDTO extends BasePageableDTO {
    @JSONField(name = "id")
    private int id;

    @JSONField(name = "pw")
    private String pw;

    @JSONField(name = "name")
    private String name;

    @JSONField(name = "pos")
    private String pos;

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
