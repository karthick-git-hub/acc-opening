package com.ao.controller;

import com.ao.model.JsonResponse;
import com.ao.service.AccountOpeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.ao.constant.AccountOpeningConstants.ACCOUNT_OPENING_ENDPOINT;

@RestController
public class AccountOpeningController {

    @Autowired
    AccountOpeningService accountOpeningService;

    @RequestMapping(method = RequestMethod.POST, value = ACCOUNT_OPENING_ENDPOINT)
    public JsonResponse<String> createHello() {
        return new JsonResponse<>(accountOpeningService.createHello());
    }
}