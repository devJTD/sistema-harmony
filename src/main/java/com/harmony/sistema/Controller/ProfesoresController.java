package com.harmony.sistema.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfesoresController {

    @GetMapping("/profesores")
    public String profesores() {
        return "profesores";
    }
}