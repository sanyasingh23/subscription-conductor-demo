package com.conductor.example.controller;

import com.conductor.example.resource.License;
import com.conductor.example.resource.Subscription;
import com.conductor.example.worker.service.WorkflowClientService;
import com.google.common.collect.ImmutableMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/context/api/v1")
public class WorkflowTriggerController {

    private final WorkflowClientService workflowClientService;

    public WorkflowTriggerController(WorkflowClientService workflowClientService) {
        this.workflowClientService = workflowClientService;
    }

    @PostMapping(value = "/subscription")
    @ResponseBody
    public Subscription subscriptionTrigger(@RequestBody @Valid Subscription subscription) {
        workflowClientService.triggerWorkflowByNameAndInput("subscription_workflow",
                ImmutableMap.of("customerName", subscription.getCustomerName(), "country", subscription.getCountry(), "eaId", subscription.getEaId(), "region", subscription.getRegion(), "status", subscription.getStatus()));
        return subscription;
    }

    @PostMapping(value = "/license")
    @ResponseBody
    public License licenseTrigger(@RequestBody @Valid License license) {
        ImmutableMap imap = ImmutableMap.builder().put("productType", license.getProductType())
                .put("quantity", license.getQuantity())
                .put("startDate", license.getStartDate())
                .put("endDate", license.getEndDate())
                .put("classification", license.getClassification())
                .put("licenseType", license.getLicenseType())
                .put("billingType", license.getBillingType())
                .put("status", license.getStatus()).build();
        workflowClientService.triggerWorkflowByNameAndInput("license_workflow", imap);

        return license;
    }
}
