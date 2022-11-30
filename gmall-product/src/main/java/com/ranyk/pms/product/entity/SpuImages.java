package com.ranyk.pms.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * CLASS_NAME: SpuImages.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: spu图片  <br/>
 * @date: 2022-11-30 <br/>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("pms_spu_images")
public class SpuImages implements Serializable {
    @Serial
    private static final long serialVersionUID = -2338979247586065078L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * spu_id
     */
    private Long spuId;
    /**
     * 图片名
     */
    private String imgName;
    /**
     * 图片地址
     */
    private String imgUrl;
    /**
     * 顺序
     */
    private Integer imgSort;
    /**
     * 是否默认图
     */
    private Integer defaultImg;
}
