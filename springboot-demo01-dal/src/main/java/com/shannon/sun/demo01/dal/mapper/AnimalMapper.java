package com.shannon.sun.demo01.dal.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shannon.sun.demo01.dal.entity.Animal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xibin sun
 */
@Mapper
public interface AnimalMapper extends BaseMapper<Animal> {
    /**
     * 根据name查找一个Animal
     */
    Animal findByAnimalName(@Param("animalName")String name);
}
