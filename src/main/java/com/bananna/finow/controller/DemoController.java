package com.bananna.finow.controller;

import com.bananna.finow.service.GeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private GeoService geoService;
}
