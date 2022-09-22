package org.susamlu.springweb.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Sam Lu
 * @date 2022/08/17
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException exception) {
        List<String> errorMessages = exception.getFieldErrors()
                .stream()
                .map(fieldError -> String.format("%s %s", fieldError.getField(),
                        fieldError.getDefaultMessage()))
                .sorted()
                .collect(Collectors.toList());

        Map<String, Object> errorMessageMap = CollectionUtils.newLinkedHashMap(2);
        errorMessageMap.put("code", HttpStatus.BAD_REQUEST.value());
        errorMessageMap.put("message", errorMessages);

        return ResponseEntity.badRequest().body(errorMessageMap);
    }

}
