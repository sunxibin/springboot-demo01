package com.shannon.sun.demo01.model.enums;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author xibin sun
 */
public enum AnimalType implements IEnum {
    /**
     * 猫
     */
    CAT("1", "猫"),
    /**
     * 狗
     */
    DOG("2", "狗")
    ;

    private String value;
    private String desc;

    AnimalType(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Serializable getValue() {
        return this.value;
    }

    public String getDesc() {
        return this.desc;
    }

//    public static AnimalType getEnum(String value) {
//        return Arrays.asList(AnimalType.values()).stream()
//                .filter(a -> a.getValue().equals(value))
//                .findFirst()
//                .orElse(null);
//    }
}
