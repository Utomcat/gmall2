package com.ranyk.common.validator;

import com.ranyk.common.exception.RRException;
import com.ranyk.common.utils.Constant;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * <a href="https://www.renren.io">人人开源</a>
 * <p>
 * 版权所有，侵权必究！
 * <p>
 * hibernate-validator校验工具类
 * <p>
 * 参考文档：<a href="http://docs.jboss.org/hibernate/validator/5.4/reference/en-US/html_single/">参考文档</a>
 *
 * @author Mark sunlightcs@gmail.com
 */
public class ValidatorUtils {
    private static Validator validator;

    static {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    /**
     * 校验对象
     * @param object        待校验对象
     * @param groups        待校验的组
     * @throws RRException  校验不通过，则报RRException异常
     */
    public static void validateEntity(Object object, Class<?>... groups)
            throws RRException {
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(object, groups);
        if (!constraintViolations.isEmpty()) {
            StringBuilder msg = new StringBuilder();
            for (ConstraintViolation<Object> constraint : constraintViolations) {
                msg.append(constraint.getMessage()).append("<br>");
            }
            throw new RRException(msg.toString());
        }
    }

    public static void validateEntity(Object object, Constant.CloudService type) {
        validateEntity(object, type.getValidatorGroupClass());
    }
}
