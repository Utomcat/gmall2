package com.ranyk.pms.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ranyk.pms.product.entity.ProductAttrValue;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ranyk
* @description: 针对表【pms_product_attr_value(spu属性值)】的数据库操作Mapper
* @date: 2022-11-30 18:57:57
*/
@Mapper
public interface ProductAttrValueMapper extends BaseMapper<ProductAttrValue> {

}




