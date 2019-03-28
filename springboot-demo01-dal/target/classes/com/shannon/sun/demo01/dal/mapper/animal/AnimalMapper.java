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

    Animal findByAnimalName(@Param("name")String name);
}