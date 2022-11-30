package com.ranyk.pms.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * CLASS_NAME: Brand.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 品牌数据库实体类  <br/>
 * @date: 2022-11-30 <br/>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("pms_brand")
public class Brand implements Serializable {


    @Serial
    private static final long serialVersionUID = 8308913691860042922L;

    /**
     * 品牌id
     */
    @TableId
    private Long brandId;

    /**
     * 品牌名
     */
    private String name;

    /**
     * 品牌logo地址
     */
    private String logo;

    /**
     * 介绍
     */
    private String descript;

    /**
     * 显示状态[0-不显示；1-显示]
     */
    private Integer showStatus;

    /**
     * 检索首字母
     */
    private String firstLetter;

    /**
     * 排序
     */
    private Integer sort;


}
