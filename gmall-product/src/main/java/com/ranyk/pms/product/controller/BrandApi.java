package com.ranyk.pms.product.controller;

import com.ranyk.pms.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CLASS_NAME: BrandApi.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 品牌API  <br/>
 * @date: 2022-11-30 <br/>
 */
@RestController
@RequestMapping("brand")
public class BrandApi {

    @Autowired
    private BrandService brandService;


}
