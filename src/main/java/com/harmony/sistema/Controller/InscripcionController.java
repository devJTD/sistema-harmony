package com.harmony.sistema.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InscripcionController {

    @GetMapping("/inscripcion")
    public String inscripcion() {
        return "inscripcion";
    }

    @GetMapping("/confirmacion")
    public String mostrarConfirmacion(
            @RequestParam(name = "correo", required = false, defaultValue = "ejemplo@harmony.com") String correo,
            @RequestParam(name = "contrasena", required = false, defaultValue = "temporal-1234") String contrasena,
            Model model) {

        model.addAttribute("correo", correo);
        model.addAttribute("contrasena", contrasena);
        
        return "confirmacion";
    }
}