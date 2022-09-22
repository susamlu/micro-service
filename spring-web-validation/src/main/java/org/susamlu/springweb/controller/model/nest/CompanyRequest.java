package org.susamlu.springweb.controller.model.nest;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Sam Lu
 * @date 2022/08/19
 */
@Data
public class CompanyRequest {

    @NotBlank
    private String name;

    @Valid
    @NotNull
    private AddressRequest address;

}
