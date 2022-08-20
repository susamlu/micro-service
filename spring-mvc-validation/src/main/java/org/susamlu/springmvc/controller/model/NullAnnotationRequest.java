package org.susamlu.springmvc.controller.model;

import lombok.Data;

import javax.validation.constraints.Null;

/**
 * @author Sam Lu
 * @date 2022/08/19
 */
@Data
public class NullAnnotationRequest {

    @Null
    private Object nullObject;

}
