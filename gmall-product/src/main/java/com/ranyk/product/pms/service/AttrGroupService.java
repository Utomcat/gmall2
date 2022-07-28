package com.ranyk.product.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ranyk.common.utils.PageUtils;
import com.ranyk.product.pms.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author ranYk
 * @email ranyikang@gmail.com
 * @date 2022-07-03 19:00:35
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

