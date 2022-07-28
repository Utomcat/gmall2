package com.ranyk.product.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ranyk.common.utils.PageUtils;
import com.ranyk.product.pms.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author ranYk
 * @email ranyikang@gmail.com
 * @date 2022-07-03 19:00:35
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

