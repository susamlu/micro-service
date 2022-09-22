package org.susamlu.springweb.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.susamlu.springweb.controller.model.group.CreateGroup;
import org.susamlu.springweb.controller.model.group.OrganizationRequest;
import org.susamlu.springweb.controller.model.group.UpdateGroup;
import org.susamlu.springweb.controller.model.nest.CompanyRequest;

/**
 * @author Sam Lu
 * @date 2022/08/19
 */
@RestController
public class GroupValidController {

    @PostMapping("/api/organizations")
    public OrganizationRequest createOrganization(
            @RequestBody @Validated(CreateGroup.class) OrganizationRequest organizationRequest) {
        return organizationRequest;
    }

    @PutMapping("/api/organizations")
    public OrganizationRequest updateOrganization(
            @RequestBody @Validated(UpdateGroup.class) OrganizationRequest organizationRequest) {
        return organizationRequest;
    }

}
