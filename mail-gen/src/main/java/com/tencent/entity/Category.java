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
@ApiModel(value="Category对象", description="")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "类目ID")
    @TableId(value = "category_id", type = IdType.AUTO)
    private Long categoryId;

    @ApiModelProperty(value = "店铺ID")
    private Long shopId;

    @ApiModelProperty(value = "父节点")
    private Long parentId;

    @ApiModelProperty(value = "产品类目名称")
    private String categoryName;

    @ApiModelProperty(value = "类目图标")
    private String icon;

    @ApiModelProperty(value = "类目的显示图片")
    private String pic;

    @ApiModelProperty(value = "排序")
    private Integer seq;

    @ApiModelProperty(value = "默认是1，表示正常状态,0为下线状态")
    private Integer status;

    @ApiModelProperty(value = "记录时间")
    private LocalDateTime recTime;

    @ApiModelProperty(value = "分类层级")
    private Integer grade;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;


}
