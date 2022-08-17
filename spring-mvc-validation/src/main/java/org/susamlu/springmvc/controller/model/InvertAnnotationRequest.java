package org.susamlu.springmvc.controller.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;

/**
 * @author Sam Lu
 * @date 2022/08/17
 */
@Data
public class InvertAnnotationRequest {

    @NotNull
    private Object notNullObject;

    @NotNull
    private String notNullString;

    @NotNull
    private Collection<Integer> notNullCollection;

    @NotNull
    private Map<String, String> notNullMap;

    @NotNull
    private int[] notNullArray;

    @NotEmpty
    private String notEmptyString;

    @NotEmpty
    private Collection<Integer> notEmptyCollection;

    @NotEmpty
    private Map<String, String> notEmptyMap;

    @NotEmpty
    private int[] notEmptyArray;

    @NotBlank
    private String notBlankString;

}
