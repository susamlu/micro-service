package org.susamlu.springmvc.controller.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

/**
 * @author Sam Lu
 * @date 2022/08/17
 */
@Data
public class UserRequest {

    @NotBlank
    private String name;

    @Min(0)
    @Max(200)
    private Integer age;

}
