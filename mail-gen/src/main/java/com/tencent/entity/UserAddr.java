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
@ApiModel(value="UserAddr对象", description="")
public class UserAddr implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "addr_id")
    @TableId(value = "addr_id", type = IdType.AUTO)
    private Long addrId;

    @ApiModelProperty(value = "用户ID")
    private String userId;

    @ApiModelProperty(value = "收货人")
    private String receiver;

    @ApiModelProperty(value = "省ID")
    private Long provinceId;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "城市ID")
    private Long cityId;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "区ID")
    private Long areaId;

    @ApiModelProperty(value = "区")
    private String area;

    @ApiModelProperty(value = "邮编")
    private String postCode;

    @ApiModelProperty(value = "地址")
    private String addr;

    @ApiModelProperty(value = "手机")
    private String mobile;

    @ApiModelProperty(value = "状态,1正常，0无效")
    private Integer status;

    @ApiModelProperty(value = "是否默认地址 1是")
    private Integer commonAddr;

    @ApiModelProperty(value = "建立时间")
    private LocalDateTime createTime;

    private Integer version;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;


}
