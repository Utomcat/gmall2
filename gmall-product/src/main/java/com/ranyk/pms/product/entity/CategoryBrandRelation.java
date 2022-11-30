package com.ranyk.pms.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * CLASS_NAME: CategoryBrandRelation.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 品牌分类关联数据库实体类  <br/>
 * @date: 2022-11-30 <br/>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("pms_category_brand_relation")
public class CategoryBrandRelation implements Serializable {
    @Serial
    private static final long serialVersionUID = 1877551924017440163L;


    /**
     *
     */
    @TableId
    private Long id;
    /**
     * 品牌id
     */
    private Long brandId;
    /**
     * 分类id
     */
    private Long cateLogId;
    /**
     *
     */
    private String brandName;
    /**
     *
     */
    private String cateLogName;

}
