package com.xunban.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 标签实体
 */
@TableName("tag")
@Data
public class Tag {
    private Integer id;

    // 标签名称
    private String tagName;

    // 用户id
    private Integer userId;

    // 父标签id
    private Integer parentId;

    // 0：不是, 1：是
    private Integer isParent;

    // 创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    // 更新时间
    private Date updateTime;

    // 是否删除 0：否
    private Integer isDelete;
}
