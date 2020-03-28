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
@ApiModel(value="Massage对象", description="")
public class Massage implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "留言创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "姓名")
    private String userName;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "联系方式")
    private String contact;

    @ApiModelProperty(value = "留言内容")
    private String content;

    @ApiModelProperty(value = "留言回复")
    private String reply;

    @ApiModelProperty(value = "状态：0:未审核 1审核通过")
    private Integer status;


}
