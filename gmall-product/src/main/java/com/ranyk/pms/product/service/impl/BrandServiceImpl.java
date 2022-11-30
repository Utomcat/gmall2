package com.ranyk.pms.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ranyk.pms.product.dao.BrandMapper;
import com.ranyk.pms.product.entity.Brand;
import com.ranyk.pms.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * CLASS_NAME: BrandServiceImp.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 品牌Service实现类  <br/>
 * @date: 2022-11-30 <br/>
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper,Brand> implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

}
