package com.harmony.sistema.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TalleresController {

    @GetMapping("/talleres")
    public String talleres() {
        return "talleres";
    }
}