package org.susamlu.springweb.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.susamlu.springweb.controller.model.NumberAnnotationRequest;
import org.susamlu.springweb.controller.model.PatternAnnotationRequest;

/**
 * @author Sam Lu
 * @date 2022/08/20
 */
@RestController
public class NumberAnnotationController {

    @PostMapping("/api/number")
    public NumberAnnotationRequest testNumberAnnotation(
            @RequestBody @Validated NumberAnnotationRequest numberAnnotationRequest) {
        return numberAnnotationRequest;
    }

}
