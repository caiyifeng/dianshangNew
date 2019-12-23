package com.mehope.app.dianshang.pojo;

import java.util.Date;

import lombok.Data;

import com.baomidou.mybatisplus.annotation.TableName;

@Data
@TableName("tb_content")
public class TbContent {
    private Long id;

    private Long categoryId;

    private String title;

    private String subTitle;

    private String titleDesc;

    private String url;

    private String pic;

    private String pic2;

    private Date created;

    private Date updated;

    private String content;

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

 
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }


    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc == null ? null : titleDesc.trim();
    }


    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }


    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2 == null ? null : pic2.trim();
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}