package org.susamlu.springmvc.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.susamlu.springmvc.controller.model.BooleanAnnotationRequest;
import org.susamlu.springmvc.controller.model.NullAnnotationRequest;

/**
 * @author Sam Lu
 * @date 2022/08/20
 */
@RestController
public class BooleanAnnotationController {

    @PostMapping("/api/boolean")
    public BooleanAnnotationRequest testBooleanAnnotation(
            @RequestBody @Validated BooleanAnnotationRequest booleanAnnotationRequest) {
        return booleanAnnotationRequest;
    }

}
