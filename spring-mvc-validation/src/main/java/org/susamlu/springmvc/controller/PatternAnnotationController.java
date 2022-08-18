package org.susamlu.springmvc.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.susamlu.springmvc.controller.model.PatternAnnotationRequest;
import org.susamlu.springmvc.controller.model.RangeAnnotationRequest;

/**
 * @author Sam Lu
 * @date 2022/08/18
 */
@RestController
public class PatternAnnotationController {

    @PostMapping("/api/pattern")
    public PatternAnnotationRequest testInvertAnnotation(
            @RequestBody @Validated PatternAnnotationRequest patternAnnotationRequest) {
        return patternAnnotationRequest;
    }

}
