/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.acrm.controller;

import ch.fhnw.acrm.business.service.AgentService;
import org.aspectj.weaver.loadtime.Agent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//Deactivated index controller as root, test
@Controller
public class IndexController {

    private final AgentService agentService;

    public IndexController(AgentService agentService) {
        this.agentService = agentService;
    }

    @GetMapping
    public String getIndexView(){
        return "index.html";
    }

    @GetMapping("/homepage")
    public String getHomepageView(){
        return "homepage/homepage";
    }

//
//@RequestMapping(value = "homepage", method = {RequestMethod.GET,RequestMethod.POST})
//    public String hello(RequestParam String boob, Model model){
//        String greeting = "Hello " + agentService.getCurrentAgent().getName();
//        return "homepage/homepage";
//}

@PostMapping(path = "/homepage")
    public String goOrder() {
    return "/save-orders-page";
    }

}


