package org.susamlu.springweb.controller.model.nest;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author Sam Lu
 * @date 2022/08/19
 */
@Data
public class AddressRequest {

    @NotBlank
    private String country;

    @NotBlank
    private String province;

    @NotBlank
    private String city;

}
