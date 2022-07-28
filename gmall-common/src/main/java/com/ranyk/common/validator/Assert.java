package com.ranyk.common.validator;

import com.ranyk.common.exception.RRException;
import org.apache.commons.lang.StringUtils;

/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * <a href="https://www.renren.io">人人开源</a>
 * <p>
 * 版权所有，侵权必究！
 * <p>
 * 数据校验
 *
 * @author Mark sunlightcs@gmail.com
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RRException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RRException(message);
        }
    }
}
