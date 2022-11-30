package com.ranyk.pms.product.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ranyk.pms.product.entity.CategoryBrandRelation;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ranyk
* @description: 针对表【pms_category_brand_relation(品牌分类关联)】的数据库操作Mapper
* @date 2022-11-30 18:57:57
*/
@Mapper
public interface CategoryBrandRelationMapper extends BaseMapper<CategoryBrandRelation> {

}




