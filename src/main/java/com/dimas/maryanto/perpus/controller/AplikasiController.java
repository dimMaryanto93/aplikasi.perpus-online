package com.dimas.maryanto.perpus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AplikasiController {

    @GetMapping(value = {"/", "/index"})
    public String halamanUtama(HttpServletRequest request) {
        request.setAttribute("message", "Halo ini dari Spring MVC dengan template engine thymeleaf");
        return "/index";
    }
}
