package com.ranyk.pms.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ranyk.pms.product.entity.Category;
import com.ranyk.pms.product.dao.CategoryMapper;
import com.ranyk.pms.product.service.CategoryService;
import org.springframework.stereotype.Service;

/**
* @author ranyk
* @description: 针对表【pms_category(商品三级分类)】的数据库操作Service实现
* @date: 2022-11-30 18:57:57
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}




