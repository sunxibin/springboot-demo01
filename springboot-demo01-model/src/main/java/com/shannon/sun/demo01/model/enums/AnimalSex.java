package com.shannon.sun.demo01.model.enums;

import java.io.Serializable;

/**
 * @author xibin sun
 */
public enum AnimalSex implements IEnum {
    /**
     * 男
     */
    CAT("1", "男"),
    /**
     * 女
     */
    DOG("2", "女")
    ;

    private String value;
    private String desc;

    AnimalSex(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Serializable getValue() {
        return null;
    }

    public String getDesc() {
        return null;
    }
}
