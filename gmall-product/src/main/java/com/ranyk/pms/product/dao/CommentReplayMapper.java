package com.ranyk.pms.product.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ranyk.pms.product.entity.CommentReplay;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ranyk
* @description: 针对表【pms_comment_replay(商品评价回复关系)】的数据库操作Mapper
* @date 2022-11-30 18:57:57
*/
@Mapper
public interface CommentReplayMapper extends BaseMapper<CommentReplay> {

}




