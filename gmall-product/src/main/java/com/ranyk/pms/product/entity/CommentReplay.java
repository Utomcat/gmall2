package com.ranyk.pms.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * CLASS_NAME: CommentReplay.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 商品评价回复关系数据库实体类  <br/>
 * @date: 2022-11-30 <br/>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("pms_comment_replay")
public class CommentReplay implements Serializable {
    @Serial
    private static final long serialVersionUID = 4432099881304816332L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * 评论id
     */
    private Long commentId;
    /**
     * 回复id
     */
    private Long replyId;
}
