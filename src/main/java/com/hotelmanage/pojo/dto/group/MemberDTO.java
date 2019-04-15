package com.hotelmanage.pojo.dto.group;

import com.alibaba.fastjson.annotation.JSONField;
import com.hotelmanage.common.util.FastJsonUtil;
import com.hotelmanage.pojo.dto.BasePageableDTO;

public class MemberDTO extends BasePageableDTO {
    @JSONField(name = "id")
    private int id;

    @JSONField(name = "group_id" )
    private int group_id;

    @JSONField(name = "room_id")
    private int room_id;

    @JSONField(name = "name")
    private String name;

    @JSONField(name = "identity")
    private String identity;

    @JSONField(name = "sex")
    private String sex;

    @JSONField(name = "tel")
    private String tel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
