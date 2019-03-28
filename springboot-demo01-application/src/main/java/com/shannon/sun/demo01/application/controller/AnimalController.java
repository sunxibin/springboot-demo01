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
    public Result<Animal> findAnimal() {
        Animal a = animalManager.getAnimalById(1L);
        Animal b = animalManager.getAnimalByName("tom");
        return new Result<Animal>(true, a, "success","200");
    }

}
