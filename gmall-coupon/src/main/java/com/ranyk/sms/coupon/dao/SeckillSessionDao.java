package com.ranyk.sms.coupon.dao;

import com.ranyk.sms.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author ranYk
 * @email ranyikang@gmail.com
 * @date 2022-07-29 17:37:29
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
