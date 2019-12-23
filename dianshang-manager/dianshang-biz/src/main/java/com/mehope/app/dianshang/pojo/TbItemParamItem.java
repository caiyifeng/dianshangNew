package com.mehope.app.dianshang.pojo;

import java.util.Date;

import lombok.Data;

import com.baomidou.mybatisplus.annotation.TableName;

@Data
@TableName("tb_item_param_item")
public class TbItemParamItem {
    private Long id;

    private Long itemId;

    private Date created;

    private Date updated;

    private String paramData;


    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}