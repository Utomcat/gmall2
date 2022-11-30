package com.ranyk.pms.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ranyk.pms.product.entity.Brand;
import org.apache.ibatis.annotations.Mapper;

/**
 * CLASS_NAME: BrandMapper.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 品牌数据库操作Mapper  <br/>
 * @date: 2022-11-30 <br/>
 */
@Mapper
public interface BrandMapper extends BaseMapper<Brand> {
}
