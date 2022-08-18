package org.susamlu.springmvc.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.susamlu.springmvc.controller.model.RangeAnnotationRequest;

/**
 * @author Sam Lu
 * @date 2022/08/16
 */
@RestController
public class RangeAnnotationController {

    @PostMapping("/api/range")
    public RangeAnnotationRequest testInvertAnnotation(
            @RequestBody @Validated RangeAnnotationRequest rangeAnnotationRequest) {
        return rangeAnnotationRequest;
    }

}
