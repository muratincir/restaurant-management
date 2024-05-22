package com.rm.restaurant.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {
    @GetMapping("/index")
    public String home() {
        return "index"; // "swagger-ui.html" veya "index.jsp" gibi bir dosya döndürür
    }

    @GetMapping("/swagger-ui")
    public String swaggerUI() {
        return "redirect:swagger-ui/index.html";
    }
}
