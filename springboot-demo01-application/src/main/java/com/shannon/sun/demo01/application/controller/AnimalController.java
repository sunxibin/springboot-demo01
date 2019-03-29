package com.shannon.sun.demo01.application.controller;

import com.shannon.sun.demo01.common.response.Result;
import com.shannon.sun.demo01.core.manager.AnimalManager;
import com.shannon.sun.demo01.dal.entity.Animal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xibin sun
 */
@RestController
@Slf4j
public class AnimalController {

    @Resource
    private AnimalManager animalManager;

    @RequestMapping(value = "/animal/get")
    public Result<?> findAnimal() {
//        Animal a = animalManager.getAnimalById(1L);
//        Animal b = animalManager.getAnimalByName("cat");

        Animal c = Animal.builder().name("dog").type(1).sex(1).master("shannon").build();
        Integer impactRows = animalManager.insert(c);
        System.out.println(impactRows);

//        return Result.success(a);
        return Result.failure("hahha");
    }

}
