package com.ranyk.product.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

/**
 * spu信息介绍
 * 
 * @author ranYk
 * @email ranyikang@gmail.com
 * @date 2022-07-03 19:00:35
 */
@Data
@TableName("pms_spu_info_desc")
public class SpuInfoDescEntity implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

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
