package com.ranyk.common.validator.group;

import javax.validation.GroupSequence;

/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * <a href="https://www.renren.io">人人开源</a>
 * <p>
 * 版权所有，侵权必究！
 * <p>
 * 定义校验顺序，如果AddGroup组失败，则UpdateGroup组不会再校验
 *
 * @author Mark sunlightcs@gmail.com
 */
@GroupSequence({AddGroup.class, UpdateGroup.class})
public interface Group {

}
