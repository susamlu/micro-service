package org.susamlu.springweb.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.susamlu.springweb.controller.model.NotAnnotationRequest;

/**
 * @author Sam Lu
 * @date 2022/08/16
 */
@RestController
public class NotAnnotationController {

    @PostMapping("/api/invert")
    public NotAnnotationRequest testNotAnnotation(
            @RequestBody @Validated NotAnnotationRequest notAnnotationRequest) {
        return notAnnotationRequest;
    }

}
