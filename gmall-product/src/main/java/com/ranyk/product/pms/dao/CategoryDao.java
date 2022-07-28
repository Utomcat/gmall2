package com.ranyk.product.pms.dao;

import com.ranyk.product.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ranYk
 * @email ranyikang@gmail.com
 * @date 2022-07-03 19:00:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
