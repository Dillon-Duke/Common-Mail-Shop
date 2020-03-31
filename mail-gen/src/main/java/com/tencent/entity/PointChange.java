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
@ApiModel(value="PointChange对象", description="")
public class PointChange implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "积分流动记录表")
    @TableId(value = "points_change_id", type = IdType.AUTO)
    private Long pointsChangeId;

    @ApiModelProperty(value = "积分钱包id")
    private Long pointsWalletId;

    @ApiModelProperty(value = "增加或减少(增加 0 减少 1)")
    private Integer addOrReduce;

    @ApiModelProperty(value = "原因(订单，邀请，签到，兑换)")
    private Integer reason;

    @ApiModelProperty(value = "积分状态（0:用户未收货待结算，1:已结算 2:用户退货退单）")
    private Integer state;

    @ApiModelProperty(value = "积分数额")
    private Double pointsNumber;

    @ApiModelProperty(value = "关联订单id")
    private Long orderId;

    @ApiModelProperty(value = "商户订单id")
    private Long merchantOrderId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;


}
