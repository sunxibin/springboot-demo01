package com.shannon.sun.demo01.dal.enums;

import java.io.Serializable;

/**
 * @author xibin sun
 */
public interface IEnum<T extends Serializable> {
    /**
     * 枚举数据库存储值
     */
    T getValue();

    String getDesc();
}
