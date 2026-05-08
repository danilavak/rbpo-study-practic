package ru.mtuci.coursemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProxyController {
    @GetMapping("/api/proxy")
    public String proxy(@RequestParam("targetUrl") String targetUrl) {
        return "Proxying external URLs is disabled";
    }
}
