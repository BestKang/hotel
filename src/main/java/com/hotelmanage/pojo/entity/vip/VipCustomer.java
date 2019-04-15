package com.hotelmanage.pojo.entity.vip;

import com.alibaba.fastjson.annotation.JSONField;
import com.hotelmanage.common.util.FastJsonUtil;
import com.hotelmanage.pojo.entity.BasePO;

public class VipCustomer extends BasePO {
    @JSONField(name = "id")
    int id;

    @JSONField(name = "name")
    String name;

    /*@JSONField(name = "issue_time",format = "yyyy-MM-dd HH:mm:ss")
    Date issueTime;

    @JSONField(name = "deadline",format = "yyyy-MM-dd HH:mm:ss")
    Date deadline;*/

    @JSONField(name = "pw")
    String pw;

    @JSONField(name = "realname")
    String realname;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
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
