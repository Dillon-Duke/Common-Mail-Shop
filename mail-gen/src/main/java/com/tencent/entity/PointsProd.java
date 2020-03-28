package com.tencent.entity;

import java.math.BigDecimal;
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
@ApiModel(value="PointsProd对象", description="")
public class PointsProd implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "积分商品id")
    @TableId(value = "points_prod_id", type = IdType.AUTO)
    private Long pointsProdId;

    @ApiModelProperty(value = "所需积分id")
    private Long pointsId;

    @ApiModelProperty(value = "所需积分量")
    private Integer pointsNumber;

    @ApiModelProperty(value = "所需金额")
    private BigDecimal amount;

    @ApiModelProperty(value = "关联商品id")
    private Long prodId;

    @ApiModelProperty(value = "库存")
    private Integer stocks;

    @ApiModelProperty(value = "状态(0下架 1上架)")
    private Integer state;

    @ApiModelProperty(value = "上架时间")
    private LocalDateTime upperShelfTime;

    @ApiModelProperty(value = "下架时间")
    private LocalDateTime lowerShelfTime;


}
