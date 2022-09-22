package org.susamlu.springweb.controller.model.group;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;

/**
 * @author Sam Lu
 * @date 2022/08/19
 */
@Data
public class OrganizationRequest {

    @NotBlank(groups = CreateGroup.class)
    @Null(groups = UpdateGroup.class)
    private String orgCode;

    @NotBlank
    private String orgName;

}
