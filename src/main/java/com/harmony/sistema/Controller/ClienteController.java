package com.harmony.sistema.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {

    @GetMapping("/horario")
    public String mostrarHorario() {
        return "horario";
    }

    @GetMapping("/cambiar-contraseña")
    public String showChangePasswordForm() {
        return "password";
    }

    @PostMapping("/cambiar-contraseña")
    public String processChangePassword() {
        return "redirect:/horario";
    }
}