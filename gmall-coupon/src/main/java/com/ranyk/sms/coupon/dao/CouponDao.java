package com.ranyk.sms.coupon.dao;

import com.ranyk.sms.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ranYk
 * @email ranyikang@gmail.com
 * @date 2022-07-29 17:37:28
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
