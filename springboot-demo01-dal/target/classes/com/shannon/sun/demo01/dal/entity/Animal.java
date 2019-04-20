package com.shannon.sun.demo01.dal.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.shannon.sun.demo01.dal.enums.AnimalSex;
import com.shannon.sun.demo01.dal.enums.AnimalType;
import lombok.Builder;
import lombok.Data;

/**
 * @author xibin sun
 */
@Data
@Builder
@TableName(value = "animal")
public class Animal extends BaseDO{

//    @TableField(value = "name") 对应的表字段
    private String name;

//    private AnimalType type;
    private Integer type;
//    private AnimalSex sex;
    private Integer sex;

    private String master;

//  表明该字段不是表字段， exist默认true
    @TableField(exist = false)
    private String test;
}
