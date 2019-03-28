package com.shannon.sun.demo01.dal.mapper.animal;

import com.shannon.sun.demo01.dal.entity.Animal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author shannon sun
 * @date 2019/3/29 0:27
 */
//@Mapper
public interface AnimalExtMapper {
    /**
     * 根据name查找一个Animal
     */
    Animal findByAnimalName(@Param("name")String name);
}
