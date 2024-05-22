package com.rm.restaurant.management.exceptions;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;

public class CustomErrorController implements ErrorController {

    public String getErrorPath() {
        return "/error";
    }

    @GetMapping("/error")
    public String handleError() {
        // Özel hata işleme mantığı veya bir hata sayfasına yönlendirme
        return "error"; // Varsayılan olarak bir error.html şablonu olduğunu varsayalım
    }

}
