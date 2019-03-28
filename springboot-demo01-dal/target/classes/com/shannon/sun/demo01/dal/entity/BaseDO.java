package com.shannon.sun.demo01.dal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author xibin sun
 */
@Data
public abstract class BaseDO {
    /** 自增id */
    @TableId(type = IdType.AUTO)
    private Long id;
    /** 记录创建的代码点 */
    private String createdApp;
    /** 创建日期 */
    private Date createdDate;
    /** 记录更新的代码点 */
    private String updatedApp;
    /** 更新日期 */
    private Date updatedDate;
}
