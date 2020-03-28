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
@ApiModel(value="TransfeeFree对象", description="")
public class TransfeeFree implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "指定条件包邮项id")
    @TableId(value = "transfee_free_id", type = IdType.AUTO)
    private Long transfeeFreeId;

    @ApiModelProperty(value = "运费模板id")
    private Long transportId;

    @ApiModelProperty(value = "包邮方式 （0 满x件/重量/体积包邮 1满金额包邮 2满x件/重量/体积且满金额包邮）")
    private Integer freeType;

    @ApiModelProperty(value = "需满金额")
    private BigDecimal amount;

    @ApiModelProperty(value = "包邮x件/重量/体积")
    private BigDecimal piece;


}
