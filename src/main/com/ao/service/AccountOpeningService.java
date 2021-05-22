package com.ao.service;

import com.ao.repository.AccountOpeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class AccountOpeningService {

    @Autowired
    AccountOpeningRepository accountOpeningRepository;

    public String createHello() {
        return accountOpeningRepository.createHello();
    }
}