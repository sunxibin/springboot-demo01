package com.shannon.sun.demo01.core.manager;

import com.shannon.sun.demo01.dal.das.IAnimalDas;
import com.shannon.sun.demo01.dal.entity.Animal;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xibin sun
 */
@Service
public class AnimalManager {

    @Resource
    private IAnimalDas animalDas;

    public Animal getAnimalById(Long id) {
        return animalDas.findById(id);
    }

    public Animal getAnimalByName(String name) {
        return animalDas.findByAnimalName(name);
    }
}
