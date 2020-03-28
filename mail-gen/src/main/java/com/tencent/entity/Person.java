package com.tencent.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="Person对象", description="")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "person_id", type = IdType.AUTO)
    private Integer personId;

    private Integer age;

    @TableField("NAME")
    private String name;

    private String nickName;

    private String birthday;

    private String isAdmin;

    private Double wealth;


}
