package com.ranyk.ums.member.controller;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

import com.ranyk.ums.member.feign.CouponFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ranyk.ums.member.entity.MemberEntity;
import com.ranyk.ums.member.service.MemberService;
import com.ranyk.common.utils.PageUtils;
import com.ranyk.common.utils.R;



/**
 * 会员
 *
 * @author ranYk
 * @date 2022-07-29 17:27:34
 */
@RefreshScope
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private CouponFeign couponFeign;

    @Value("${ums.user.name}")
    private String name;
    @Value("${ums.user.gender}")
    private Integer gender;

    @RequestMapping("/getAllMemberInfo")
    public R getAllMemberInfo(){
        MemberEntity member = new MemberEntity();
        member.setUsername("张三");
        R allCoupon = couponFeign.getAllCoupon();
        return Objects.requireNonNull(R.ok().put("user", member)).put("coupons",allCoupon.get("coupons"));
    }

    @RequestMapping("getUser")
    public R getUser(){
        MemberEntity member = new MemberEntity();
        member.setUsername(name);
        member.setGender(gender);
        return R.ok().put("user",member);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
