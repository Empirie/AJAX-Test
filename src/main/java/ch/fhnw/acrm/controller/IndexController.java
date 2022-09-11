/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.acrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//Deactivated index controller as root, test
@Controller
public class IndexController {


    @GetMapping
    public String getIndexView(){
        return "index.html";
    }

    @GetMapping("/homepage")
    public String getHomepageView(){
        return "homepage/homepage";
    }


}
