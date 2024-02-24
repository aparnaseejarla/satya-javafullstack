package com.test.service.impl;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import com.test.service.WebSessionService;

@Service
@ConditionalOnProperty(name = "app.feature.new", havingValue = "false", matchIfMissing = true)
public class PostgreSessionService implements WebSessionService {
    @Override
    public String getUserData() {
        return "Data from PostgreSQL Database";
    }
}
