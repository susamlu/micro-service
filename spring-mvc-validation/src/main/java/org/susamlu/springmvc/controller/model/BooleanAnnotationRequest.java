package org.susamlu.springmvc.controller.model;

import lombok.Data;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;

/**
 * @author Sam Lu
 * @date 2022/08/19
 */
@Data
public class BooleanAnnotationRequest {

    @AssertTrue
    private Boolean trueParam;

    @AssertFalse
    private boolean falseParam;

}
