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
@ApiModel(value="ShopDetail对象", description="")
public class ShopDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "shop_id")
    @TableId(value = "shop_id", type = IdType.AUTO)
    private Long shopId;

    @ApiModelProperty(value = "店铺名称(数字、中文，英文(可混合，不可有特殊字符)，可修改)、不唯一")
    private String shopName;

    @ApiModelProperty(value = "店长用户id")
    private String userId;

    @ApiModelProperty(value = "店铺类型")
    private Integer shopType;

    @ApiModelProperty(value = "店铺简介(可修改)")
    private String intro;

    @ApiModelProperty(value = "店铺公告(可修改)")
    private String shopNotice;

    @ApiModelProperty(value = "店铺行业(餐饮、生鲜果蔬、鲜花等)")
    private String shopIndustry;

    @ApiModelProperty(value = "店长")
    private String shopOwner;

    @ApiModelProperty(value = "店铺绑定的手机(登录账号：唯一)")
    private String mobile;

    @ApiModelProperty(value = "店铺联系电话")
    private String tel;

    @ApiModelProperty(value = "店铺所在纬度(可修改)")
    private String shopLat;

    @ApiModelProperty(value = "店铺所在经度(可修改)")
    private String shopLng;

    @ApiModelProperty(value = "店铺详细地址")
    private String shopAddress;

    @ApiModelProperty(value = "店铺所在省份（描述）")
    private String province;

    @ApiModelProperty(value = "店铺所在城市（描述）")
    private String city;

    @ApiModelProperty(value = "店铺所在区域（描述）")
    private String area;

    @ApiModelProperty(value = "店铺省市区代码，用于回显")
    private String pcaCode;

    @ApiModelProperty(value = "店铺logo(可修改)")
    private String shopLogo;

    @ApiModelProperty(value = "店铺相册")
    private String shopPhotos;

    @ApiModelProperty(value = "每天营业时间段(可修改)")
    private String openTime;

    @ApiModelProperty(value = "店铺状态(-1:未开通 0: 停业中 1:营业中)，可修改")
    private Integer shopStatus;

    @ApiModelProperty(value = "0:商家承担运费; 1:买家承担运费")
    private Integer transportType;

    @ApiModelProperty(value = "固定运费")
    private BigDecimal fixedFreight;

    @ApiModelProperty(value = "满X包邮")
    private BigDecimal fullFreeShipping;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "分销开关(0:开启 1:关闭)")
    private Integer isDistribution;


}
