package com.mehope.app.dianshang.pojo;

import java.util.Date;

import lombok.Data;

import com.baomidou.mybatisplus.annotation.TableName;

@Data
@TableName("tb_item")
public class TbItem {
    private Long id;

    private String title;

    private String sellPoint;

    private Long price;

    private Integer num;

    private String barcode;

    private String image;

    private Long cid;

    private Byte status;

    private Date created;

    private Date updated;


    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }


    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint == null ? null : sellPoint.trim();
    }


    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }


    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

}