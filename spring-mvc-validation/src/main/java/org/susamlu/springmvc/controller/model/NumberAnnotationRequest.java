package org.susamlu.springmvc.controller.model;

import lombok.Data;

import javax.validation.constraints.*;
import java.math.BigDecimal;

/**
 * @author Sam Lu
 * @date 2022/08/20
 */
@Data
public class NumberAnnotationRequest {

    @Min(1)
    @Max(2)
    private Integer limitedInteger;

    @DecimalMin("1.5")
    @DecimalMax("2.5")
    private BigDecimal limitedBigDecimal;

    @Digits(integer = 1, fraction = 2)
    private BigDecimal digits;

    @Negative
    private short negative;

    @NegativeOrZero
    private int negativeOrZero;

    @Positive
    private long positive;

    @PositiveOrZero
    private BigDecimal positiveOrZero;

}
