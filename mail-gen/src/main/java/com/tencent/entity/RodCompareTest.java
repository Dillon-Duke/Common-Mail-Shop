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
@ApiModel(value="RodCompareTest对象", description="")
public class RodCompareTest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "产品ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "商品名称")
    private String prod-name;

    @ApiModelProperty(value = "店铺id")
    private Long shopId;

    @ApiModelProperty(value = "原价")
    private BigDecimal oriPrice;

    @ApiModelProperty(value = "现价")
    private BigDecimal price;

    @ApiModelProperty(value = "简要描述,卖点等")
    private String brief;

    @ApiModelProperty(value = "详细描述")
    private String content;

    @ApiModelProperty(value = "商品主图")
    private String pic;

    @ApiModelProperty(value = "商品图片，以,分割")
    private String imgs;

    @ApiModelProperty(value = "默认是1，表示正常状态, -1表示删除, 0下架")
    private Integer status;

    @ApiModelProperty(value = "商品分类")
    private Long categoryId;

    @ApiModelProperty(value = "销量")
    private Integer soldNum;

    @ApiModelProperty(value = "总库存")
    private Integer totalStocks;

    @ApiModelProperty(value = "配送方式json见TransportModeVO")
    private String deliveryMode;

    @ApiModelProperty(value = "运费模板id")
    private Long deliveryTemplateId;

    @ApiModelProperty(value = "录入时间")
    private BigDecimal createTime;

    @ApiModelProperty(value = "修改时间")
    private BigDecimal updateTime;

    @ApiModelProperty(value = "上架时间")
    private BigDecimal putawayTime;

    @ApiModelProperty(value = "版本 乐观锁")
    private Integer version;


}
