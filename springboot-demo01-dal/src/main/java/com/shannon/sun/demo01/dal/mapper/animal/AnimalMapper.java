package com.shannon.sun.demo01.dal.mapper.animal;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shannon.sun.demo01.dal.entity.Animal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author shannon sun
 * @date 2019/3/29 0:26
 */
@Mapper
public interface AnimalMapper extends BaseMapper<Animal> {

    /**
     * 一个自定义sql
     * 也可以新建一个mapper.java
     * 如果没有自定义sql, mapper.xml也可以不要
     */
    Animal findByAnimalName(@Param("name")String name);
}