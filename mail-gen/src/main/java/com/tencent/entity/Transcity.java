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
@ApiModel(value="Transcity对象", description="")
public class Transcity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "transcity_id")
    @TableId(value = "transcity_id", type = IdType.AUTO)
    private Long transcityId;

    @ApiModelProperty(value = "运费项id")
    private Long transfeeId;

    @ApiModelProperty(value = "城市id")
    private Long cityId;


}
