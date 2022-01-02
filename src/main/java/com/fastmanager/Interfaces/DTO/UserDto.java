package com.fastmanager.Interfaces.DTO;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @ClassName: UserDto
 * @Description:
 * @Author:王红飞
 * @Date: 2022/1/2
 */
@Data
public class UserDto {
    @NotEmpty(message = "用户名不得为空")
    private String username;
}
