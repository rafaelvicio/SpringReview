package br.com.rafaelvicio.springeview.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemandaController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    
}