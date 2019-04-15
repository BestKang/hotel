package com.hotelmanage.pojo.dto.vip;

import com.alibaba.fastjson.annotation.JSONField;
import com.hotelmanage.common.util.FastJsonUtil;
import com.hotelmanage.pojo.dto.BasePageableDTO;

public class VipCustomerDTO extends BasePageableDTO {
    @JSONField(name = "id")
    private int id;

    @JSONField(name = "name")
    private String name;

    /*@JSONField(name = "issue_time",format = "yyyy-MM-dd HH:mm:ss")
    Date issueTime;

    @JSONField(name = "deadline",format = "yyyy-MM-dd HH:mm:ss")
    Date deadline;*/

    @JSONField(name = "pw")
    private String pw;

    @JSONField(name = "realname")
    private String realname;

    @JSONField(name = "identity")
    private String identity;

    @JSONField(name = "sex")
    private  String sex;

    @JSONField(name = "tel")
    private String tel;

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
