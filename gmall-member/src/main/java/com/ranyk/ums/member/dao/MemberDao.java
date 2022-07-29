package com.ranyk.ums.member.dao;

import com.ranyk.ums.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ranYk
 * @email ranyikang@gmail.com
 * @date 2022-07-29 17:27:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
