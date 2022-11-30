package com.ranyk.pms.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ranyk.pms.product.dao.ProductAttrValueMapper;
import com.ranyk.pms.product.entity.ProductAttrValue;
import com.ranyk.pms.product.service.ProductAttrValueService;
import org.springframework.stereotype.Service;

/**
 * @author ranyk
 * @description: 针对表【pms_product_attr_value(spu属性值)】的数据库操作Service实现
 * @date: 2022-11-30 18:57:57
 */
@Service
public class ProductAttrValueServiceImpl extends ServiceImpl<ProductAttrValueMapper, ProductAttrValue> implements ProductAttrValueService {

}
