package org.susamlu.springweb.controller.model;

import lombok.Data;

import javax.validation.constraints.Pattern;

/**
 * @author Sam Lu
 * @date 2022/08/18
 */
@Data
public class PatternAnnotationRequest {

    @Pattern(regexp = "^1[3456789]\\d{9}$", message = "手机号码格式不正确")
    private String mobile;

}
