package com.rotas.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RotasController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/link")
    public String link() {
        return "link";
    }
}
