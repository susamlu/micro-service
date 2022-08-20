package org.susamlu.springmvc.controller.model;

import lombok.Data;

import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import java.util.Date;

/**
 * @author Sam Lu
 * @date 2022/08/20
 */
@Data
public class TimeAnnotationRequest {

    @Past
    private Date past;

    @PastOrPresent
    private Date pastOrPresent;

    @Future
    private Date future;

    @FutureOrPresent
    private Date futureOrPresent;

}
