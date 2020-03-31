package com.tencent.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jinpeng
 * @since 2020-03-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ProdTag对象", description="")
public class ProdTag implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "分组标签id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "分组标题")
    private String title;

    @ApiModelProperty(value = "店铺Id")
    private Long shopId;

    @ApiModelProperty(value = "状态(1为正常,0为删除)")
    private Integer status;

    @ApiModelProperty(value = "默认类型(0:商家自定义,1:系统默认)")
    private Integer isDefault;

    @ApiModelProperty(value = "商品数量")
    private Integer prodCount;

    @ApiModelProperty(value = "列表样式(0:一列一个,1:一列两个,2:一列三个)")
    private Integer style;

    @ApiModelProperty(value = "排序")
    private Integer seq;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除时间")
    private LocalDateTime deleteTime;


}
