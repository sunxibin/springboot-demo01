package com.shannon.sun.demo01.dal.das;

import com.shannon.sun.demo01.dal.entity.Animal;
import org.apache.ibatis.annotations.Param;

/**
 * @author xibin sun
 */
public interface IAnimalDas {
    Animal findByAnimalName(String name);

    Animal findById(Long id);

    Integer insert(Animal animal);
}
