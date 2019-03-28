package com.shannon.sun.demo01.model.enums;

import java.io.Serializable;

/**
 * @author xibin sun
 */
public interface IEnum {
    /**
     * 获取枚举名
     */
    Serializable getValue();

    /**
     * 获取描述信息
     */
    String getDesc();

}
