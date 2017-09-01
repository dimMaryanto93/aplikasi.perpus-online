package com.dimas.maryanto.perpus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplikasiController {

    @GetMapping(value = {"/", "/index"})
    public String halamanUtama() {
        return "index";
    }
}
