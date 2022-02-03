package com.tw.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProtectResources {

    @GetMapping("/resources")
    public String resources() {
        return "resources";
    }
}
