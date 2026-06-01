package com.anas.nexus.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HealthService {

    public Map<String, String> getHealthStatus() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        response.put("service", "Nexus Inventory Engine");
        return response;
    }
}