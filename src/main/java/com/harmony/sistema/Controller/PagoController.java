package com.harmony.sistema.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PagoController {
    
    // 1. Maneja la solicitud POST que viene del formulario de inscripción.
    // Redirige al método GET para mostrar la página.
    @PostMapping("/pago")
    public String procesarInscripcionYRedirigirAPago() {
        return "redirect:/pago";
    }

    // 2. Muestra la página de pago (maneja acceso directo y la redirección POST).
    @GetMapping("/pago")
    public String mostrarPaginaPago() {
        // Simplemente devuelve la plantilla 'pago.html'
        return "pago";
    }
}