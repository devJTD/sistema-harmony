package com.harmony.sistema.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcercaController {

    @GetMapping("/acerca")
    public String acercaDeNosotros() {
        return "acerca";
    }
}