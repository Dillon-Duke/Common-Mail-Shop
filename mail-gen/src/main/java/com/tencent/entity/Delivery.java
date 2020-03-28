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
@ApiModel(value="Delivery对象", description="")
public class Delivery implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "dvy_id", type = IdType.AUTO)
    private Long dvyId;

    @ApiModelProperty(value = "物流公司名称")
    private String dvyName;

    @ApiModelProperty(value = "公司主页")
    private String companyHomeUrl;

    @ApiModelProperty(value = "建立时间")
    private LocalDateTime recTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "物流查询接口")
    private String queryUrl;


}
