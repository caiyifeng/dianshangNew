package com.mehope.app.dianshang.pojo;

import java.util.Date;

import lombok.Data;

import com.baomidou.mybatisplus.annotation.TableName;

@Data
@TableName("tb_user")
public class TbUser {
    private Long id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Date created;

    private Date updated;

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }


    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }


    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }


    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

}