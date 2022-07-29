package com.ranyk.wms.ware.dao;

import com.ranyk.wms.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author ranYk
 * @email ranyikang@gmail.com
 * @date 2022-07-29 17:33:28
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
