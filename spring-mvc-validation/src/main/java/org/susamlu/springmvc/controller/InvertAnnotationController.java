package org.susamlu.springmvc.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.susamlu.springmvc.controller.model.InvertAnnotationRequest;
import org.susamlu.springmvc.controller.model.UserRequest;

/**
 * @author Sam Lu
 * @date 2022/08/16
 */
@RestController
public class InvertAnnotationController {

    @PostMapping("/api/invert")
    public InvertAnnotationRequest testInvertAnnotation(
            @RequestBody @Validated InvertAnnotationRequest invertAnnotationRequest) {
        return invertAnnotationRequest;
    }

}
