package org.susamlu.springmvc.controller.model;

import lombok.Data;

import javax.validation.constraints.Email;

/**
 * @author Sam Lu
 * @date 2022/08/20
 */
@Data
public class EmailAnnotationRequest {

    @Email
    private String email;

}
