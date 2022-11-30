package com.ranyk.pms.product.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ranyk.pms.product.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ranyk
* @description: 针对表【pms_category(商品三级分类)】的数据库操作Mapper
* @date: 2022-11-30 18:57:57
*/
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}




