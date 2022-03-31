package com.lzw.swagger_demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author LZW
 * @Description
 * @Date 2022-03-29 8:57
 * @Version 1.0
 */

@Data
@ApiModel(" User 实体类")
public class User {
    @ApiModelProperty("用户ID")
    private String uid;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;
}
