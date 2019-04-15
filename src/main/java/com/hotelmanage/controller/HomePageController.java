package com.hotelmanage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("homepage")
public class HomePageController {
    private static final Logger logger = LoggerFactory.getLogger(HomePageController.class);


    @RequestMapping(value = "/load.html", method = RequestMethod.GET)
    public String loadHomePage() {
        return "pages/admin/login";
    }



}
