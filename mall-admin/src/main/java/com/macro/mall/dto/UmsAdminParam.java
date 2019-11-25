package com.macro.mall.dto;

import cn.hutool.json.JSONUtil;
import com.macro.mall.model.UmsAdmin;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import net.sf.json.JSON;
import net.sf.json.util.JSONUtils;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;
import java.sql.SQLOutput;

/**
 * 用户登录参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class UmsAdminParam implements Serializable {
    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;
    @ApiModelProperty(value = "用户头像")
    private String icon;
    @ApiModelProperty(value = "邮箱")
    @Email(message = "邮箱格式不合法")
    private String email;
    @ApiModelProperty(value = "用户昵称")
    private String nickName;
    @ApiModelProperty(value = "备注")
    private String note;

    public static void main(String[] args) {
        UmsAdminParam param = new UmsAdminParam();
        param.setEmail("249363879@qq.com");
        param.setPassword("123456");
        param.setUsername("admin2");
        System.out.println(JSONUtil.parse(param).toString());
    }
}
