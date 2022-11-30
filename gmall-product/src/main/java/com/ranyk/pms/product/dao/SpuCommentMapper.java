package com.ranyk.pms.product.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ranyk.pms.product.entity.SpuComment;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ranyk
* @description: 针对表【pms_spu_comment(商品评价)】的数据库操作Mapper
* @date: 2022-11-30 18:57:56
*/
@Mapper
public interface SpuCommentMapper extends BaseMapper<SpuComment> {

}




