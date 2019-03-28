package com.shannon.sun.demo01.dal.enums;


import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author xibin sun
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AnimalSex implements IEnum<Integer> {
    /**
     * 男
     */
    MAN(1, "男"),
    /**
     * 女
     */
    WOMAN(2, "女")
    ;

    private Integer value;
    private String desc;

    AnimalSex(final Integer value, final String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Integer getValue() {
        return this.value;
    }

    public String getDesc() {
        return this.desc;
    }
}
