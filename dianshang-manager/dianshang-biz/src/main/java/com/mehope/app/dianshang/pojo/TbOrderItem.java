package com.mehope.app.dianshang.pojo;

import java.util.Date;

import lombok.Data;

import com.baomidou.mybatisplus.annotation.TableName;

@Data
@TableName("tb_order_item")
public class TbOrderItem {
    private String id;

    private String itemId;

    private String orderId;

    private Integer num;

    private String title;

    private Long price;

    private Long totalFee;

    private String picPath;


    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }


    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }


    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }
}