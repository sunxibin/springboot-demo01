package com.shannon.sun.demo01.dal.das.impl;

import com.shannon.sun.demo01.dal.das.IAnimalDas;
import com.shannon.sun.demo01.dal.entity.Animal;
import com.shannon.sun.demo01.dal.mapper.animal.AnimalExtMapper;
import com.shannon.sun.demo01.dal.mapper.animal.AnimalMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xibin sun
 */
@Service
public class AnimalDas implements IAnimalDas {

    @Resource
    private AnimalMapper animalMapper;
//    @Resource
//    private AnimalExtMapper animalExtMapper;

    public Animal findByAnimalName(String name) {
        return animalMapper.findByAnimalName(name);
    }

    public Animal findById(Long id) {
        return animalMapper.selectById(id);

//        QueryWrapper<Animal> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("id", id);
//        List<Animal> list = animalMapper.selectList(queryWrapper);
//        return list.get(0);
    }
}
