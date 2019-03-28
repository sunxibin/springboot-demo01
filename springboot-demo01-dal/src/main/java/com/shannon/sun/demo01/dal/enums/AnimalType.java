package com.shannon.sun.demo01.dal.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

/**
 * @author xibin sun
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AnimalType implements IEnum<Integer> {
    /**
     * 猫
     */
    CAT(1, "猫"),
    /**
     * 狗
     */
    DOG(2, "狗")
    ;

    private Integer value;
    private String desc;

    AnimalType(final Integer value, final String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Integer getValue() {
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
