package com.shannon.sun.demo01.dal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.shannon.sun.demo01.model.enums.AnimalSex;
import com.shannon.sun.demo01.model.enums.AnimalType;
import lombok.Data;

/**
 * @author xibin sun
 */
@Data
@TableName(value = "animal")
public class Animal extends BaseDO{

//    @TableField(value = "name") 对应的表字段
    private String name;

    private AnimalType type;

    private AnimalSex sex;

    private String master;

//  表明该字段不是表字段， exist默认true
    @TableField(exist = false)
    private String test;
}
