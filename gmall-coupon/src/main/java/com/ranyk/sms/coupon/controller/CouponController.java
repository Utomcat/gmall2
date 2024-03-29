package com.ranyk.sms.coupon.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ranyk.sms.coupon.entity.CouponEntity;
import com.ranyk.sms.coupon.service.CouponService;
import com.ranyk.common.utils.PageUtils;
import com.ranyk.common.utils.R;



/**
 * 优惠券信息
 *
 * @author ranYk
 * @date 2022-07-29 17:37:28
 */
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    /**
     * 模拟获取所有优惠券
     *
     * @return 返回请求响应对象 {@link R}
     */
    @RequestMapping("getAllCoupon")
    public R getAllCoupon(){
        List<CouponEntity> coupons = new ArrayList<>(10);
        for (int i = 1; i < 10; i++) {
            CouponEntity coupon = new CouponEntity();
            coupon.setCouponName("满"+i+"减 0."+i);
            coupons.add(coupon);
        }
        return R.ok().put("coupons",coupons);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
