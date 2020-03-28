package com.tencent.entity;

import java.math.BigDecimal;
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
@ApiModel(value="Transfee对象", description="")
public class Transfee implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "transfee_id")
    @TableId(value = "transfee_id", type = IdType.AUTO)
    private Long transfeeId;

    @ApiModelProperty(value = "运费模板id")
    private Long transportId;

    @ApiModelProperty(value = "续件数量")
    private BigDecimal continuousPiece;

    @ApiModelProperty(value = "首件数量")
    private BigDecimal firstPiece;

    @ApiModelProperty(value = "续件费用")
    private BigDecimal continuousFee;

    @ApiModelProperty(value = "首件费用")
    private BigDecimal firstFee;


}
