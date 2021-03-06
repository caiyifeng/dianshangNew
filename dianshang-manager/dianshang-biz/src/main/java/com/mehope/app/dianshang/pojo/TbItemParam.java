package com.mehope.app.dianshang.pojo;

import java.util.Date;

import lombok.Data;

import com.baomidou.mybatisplus.annotation.TableName;

@Data
@TableName("tb_item_param")
public class TbItemParam {
    private Long id;

    private Long itemCatId;

    private Date created;

    private Date updated;

    private String paramData;


    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}