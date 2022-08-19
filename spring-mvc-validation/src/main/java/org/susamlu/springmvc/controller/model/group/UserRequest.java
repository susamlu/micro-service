package org.susamlu.springmvc.controller.model.group;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author Sam Lu
 * @date 2022/08/19
 */
public class UserRequest {

    @NotBlank
    @Pattern(regexp = "^1[3456789]\\d{9}$", message = "手机号码格式不正确")
    private String mobile;

    @NotBlank
    private String name;

}
