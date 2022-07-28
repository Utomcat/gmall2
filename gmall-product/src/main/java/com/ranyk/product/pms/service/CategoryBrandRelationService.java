package com.ranyk.product.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ranyk.common.utils.PageUtils;
import com.ranyk.product.pms.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author ranYk
 * @email ranyikang@gmail.com
 * @date 2022-07-03 19:00:35
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

