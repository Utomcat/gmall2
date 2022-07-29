package com.ranyk.oms.order.dao;

import com.ranyk.oms.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author ranYk
 * @email ranyikang@gmail.com
 * @date 2022-07-29 17:21:31
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
