package org.susamlu.springmvc.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.susamlu.springmvc.controller.model.group.CreateGroup;
import org.susamlu.springmvc.controller.model.group.OrganizationRequest;
import org.susamlu.springmvc.controller.model.group.UpdateGroup;
import org.susamlu.springmvc.controller.model.nest.CompanyRequest;

import javax.validation.groups.Default;

/**
 * @author Sam Lu
 * @date 2022/08/19
 */
@RestController
public class GroupValidController {

    @PostMapping("/api/organizations")
    public OrganizationRequest createOrganization(
            @RequestBody @Validated({CreateGroup.class, Default.class}) OrganizationRequest organizationRequest) {
        return organizationRequest;
    }

    @PutMapping("/api/organizations")
    public OrganizationRequest updateOrganization(
            @RequestBody @Validated({UpdateGroup.class, Default.class}) OrganizationRequest organizationRequest) {
        return organizationRequest;
    }

}
