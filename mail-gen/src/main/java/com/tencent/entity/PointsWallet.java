package com.tencent.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="PointsWallet对象", description="")
public class PointsWallet implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "积分钱包id")
    @TableId(value = "points_wallet_id", type = IdType.AUTO)
    private Long pointsWalletId;

    @ApiModelProperty(value = "积分Id")
    private Long pointsId;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "待结算积分")
    private Integer unsettled;

    @ApiModelProperty(value = "已结算积分")
    private Integer settled;

    @ApiModelProperty(value = "积累收益积分")
    private Integer addUp;

    @ApiModelProperty(value = "乐观锁")
    private Integer version;


}
