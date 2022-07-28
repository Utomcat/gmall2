package com.ranyk.product.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ranyk.common.utils.PageUtils;
import com.ranyk.product.pms.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author ranYk
 * @email ranyikang@gmail.com
 * @date 2022-07-03 19:00:35
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

