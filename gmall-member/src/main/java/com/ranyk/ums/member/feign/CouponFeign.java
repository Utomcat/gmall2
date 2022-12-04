package com.ranyk.ums.member.feign;

import com.ranyk.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * CLASS_NAME: CouponFeign.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: CouponFeign 远程调用接口  <br/>
 * @date: 2022-12-01 <br/>
 */
@Component
@FeignClient("sms")
public interface CouponFeign {

    @RequestMapping("coupon/coupon/getAllCoupon")
    R getAllCoupon();
}
