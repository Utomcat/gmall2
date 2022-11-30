package com.ranyk.pms.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * CLASS_NAME: Attr.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 商品属性数据库实体类  <br/>
 * @date: 2022-11-30 <br/>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("pms_attr")
public class Attr implements Serializable {
    @Serial
    private static final long serialVersionUID = -7352256701614508203L;

    /**
     * 属性id
     */
    @TableId
    private Long attrId;
    /**
     * 属性名
     */
    private String attrName;
    /**
     * 是否需要检索[0-不需要，1-需要]
     */
    private Integer searchType;
    /**
     * 属性图标
     */
    private String icon;
    /**
     * 可选值列表[用逗号分隔]
     */
    private String valueSelect;
    /**
     * 属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]
     */
    private Integer attrType;
    /**
     * 启用状态[0 - 禁用，1 - 启用]
     */
    private Long enable;
    /**
     * 所属分类
     */
    private Long cateLogId;
    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
     */
    private Integer showDesc;
}
