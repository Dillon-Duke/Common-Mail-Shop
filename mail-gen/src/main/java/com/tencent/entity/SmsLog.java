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
@ApiModel(value="SmsLog对象", description="")
public class SmsLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "手机号码")
    private String userPhone;

    @ApiModelProperty(value = "短信内容")
    private String content;

    @ApiModelProperty(value = "手机验证码")
    private String mobileCode;

    @ApiModelProperty(value = "短信类型  1:注册  2:验证")
    private Integer type;

    @ApiModelProperty(value = "发送时间")
    private LocalDateTime recDate;

    @ApiModelProperty(value = "发送短信返回码")
    private String responseCode;

    @ApiModelProperty(value = "状态  1:有效  0：失效")
    private Integer status;


}
