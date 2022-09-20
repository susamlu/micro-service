package org.susamlu.springweb.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.susamlu.springweb.controller.model.PatternAnnotationRequest;
import org.susamlu.springweb.controller.model.RangeAnnotationRequest;

/**
 * @author Sam Lu
 * @date 2022/08/18
 */
@RestController
public class PatternAnnotationController {

    @PostMapping("/api/pattern")
    public PatternAnnotationRequest testPatternAnnotation(
            @RequestBody @Validated PatternAnnotationRequest patternAnnotationRequest) {
        return patternAnnotationRequest;
    }

}
