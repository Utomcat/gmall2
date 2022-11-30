package com.ranyk.pms.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * CLASS_NAME: SpuInfoDesc.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: spu信息介绍数据库实体类  <br/>
 * @date: 2022-11-30 <br/>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("pms_spu_info_desc")
public class SpuInfoDesc implements Serializable {
    @Serial
    private static final long serialVersionUID = -6858215784377020179L;

    /**
     * 商品id
     */
    @TableId
    private Long spuId;
    /**
     * 商品介绍
     */
    private String decript;
}
