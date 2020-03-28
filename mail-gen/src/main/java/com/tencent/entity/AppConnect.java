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
@ApiModel(value="AppConnect对象", description="")
public class AppConnect implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "本系統userId")
    private String userId;

    @ApiModelProperty(value = "第三方系統id  微信小程序id")
    private Integer appId;

    @ApiModelProperty(value = "第三方系統昵稱")
    private String nickName;

    @ApiModelProperty(value = "第三方系統頭像")
    private String imageUrl;

    @ApiModelProperty(value = "第三方系統userid")
    private String bizUserId;

    @ApiModelProperty(value = "第三方系統unionid")
    private String bizUnionId;


}
