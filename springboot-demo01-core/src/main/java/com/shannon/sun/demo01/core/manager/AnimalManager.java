package com.shannon.sun.demo01.core.manager;

import com.shannon.sun.demo01.dal.entity.Animal;

/**
 * @author shannon sun
 * @date 2019/4/2 23:27
 */
public interface AnimalManager {

    Animal getAnimalById(Long id);

    Integer insert(Animal animal);

    Animal getAnimalByName(String name);
}
