package com.ranyk.pms;


import com.alibaba.fastjson2.JSON;
import com.ranyk.pms.product.entity.Brand;
import com.ranyk.pms.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class GmallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    /**
     * 执行品牌数据新增测试
     */
    @Test
    void contextLoads() {
        // Brand brand = new Brand();
        // brand.setName("华为");
        // boolean save = brandService.save(brand);
        // log.info("保存 {}", save ? "成功" : "失败");
    }

    @Test
    void test0() {
        List<Brand> brands = brandService.list();
        brands.forEach(item -> log.info(JSON.toJSONString(item)));
    }

}
