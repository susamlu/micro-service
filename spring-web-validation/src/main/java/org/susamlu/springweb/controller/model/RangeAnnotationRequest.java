package org.susamlu.springweb.controller.model;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Map;

/**
 * @author Sam Lu
 * @date 2022/08/18
 */
@Data
public class RangeAnnotationRequest {

    @Size(min = 1, max = 5)
    private String limitedString;

    @Size(min = 1, max = 5)
    private Collection<Integer> limitedCollection;

    @Size(min = 1, max = 5)
    private Map<String, String> limitedMap;

    @Size(min = 1, max = 5)
    private int[] limitedArray;

    @Min(1)
    @Max(2)
    private Integer limitedNumber;

}
