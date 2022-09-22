package org.susamlu.springweb.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.susamlu.springweb.controller.model.nest.CompanyRequest;

/**
 * @author Sam Lu
 * @date 2022/08/19
 */
@RestController
public class NestValidController {

    @PostMapping("/api/companies")
    public CompanyRequest createCompany(@RequestBody @Validated CompanyRequest companyRequest) {
        return companyRequest;
    }

}
