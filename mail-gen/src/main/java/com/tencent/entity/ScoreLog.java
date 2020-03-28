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
@ApiModel(value="ScoreLog对象", description="")
public class ScoreLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "积分记录id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "0支出 1收入")
    private Integer type;

    @ApiModelProperty(value = "记录创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "流水号")
    private String sn;

    @ApiModelProperty(value = "积分类型：1回收加积分 2购买减积分")
    private Integer scoreType;


}
