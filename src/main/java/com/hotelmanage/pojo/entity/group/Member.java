package com.hotelmanage.pojo.entity.group;
import com.hotelmanage.pojo.entity.BasePO;
import com.alibaba.fastjson.annotation.JSONField;
import com.hotelmanage.common.util.FastJsonUtil;

public class Member extends BasePO {
    @JSONField(name = "id")
    int id;

    @JSONField(name = "group_id" )
    int group_id;

    @JSONField(name = "room_id")
    int room_id;

    @JSONField(name = "name")
    String name;

    @JSONField(name = "identity")
    String identity;

    @JSONField(name = "sex")
    String sex;

    @JSONField(name = "tel")
    String tel;

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
