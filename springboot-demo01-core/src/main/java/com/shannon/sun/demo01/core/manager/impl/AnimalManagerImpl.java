package com.shannon.sun.demo01.core.manager.impl;

import com.shannon.sun.demo01.core.manager.AnimalManager;
import com.shannon.sun.demo01.dal.das.IAnimalDas;
import com.shannon.sun.demo01.dal.entity.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xibin sun
 */

//@Service注解默认bean的首字母小写
@Service
public class AnimalManagerImpl implements AnimalManager {

    //@Resource有name和type属性，默认byName自动注入
    //@Resource(name = "animalDas")
    //如果IAnimalDas有两个实现bean，使用的是@Autowired注解，则要配上@Qualifier("animalDas")
    @Resource
    private IAnimalDas animalDas;


    @Override
    public Animal getAnimalById(Long id) {
        return animalDas.findById(id);
    }

    @Override
    public Integer insert(Animal animal) {
        return animalDas.insert(animal);
    }

    @Override
    public Animal getAnimalByName(String name) {
        return animalDas.findByAnimalName(name);
    }
}
