package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.model.EstadoPropiedad;
import co.edu.usbcali.inmobiliaria.service.EstadoPropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estado-propiedad")
@RequiredArgsConstructor
public class EstadoPropiedadController {
    // Inyección de dependencias del Servicio en el Controlador
    private final EstadoPropiedadService estadoPropiedadService;

    @GetMapping("/todos")
    public List<EstadoPropiedad> buscarTodos(){
        return estadoPropiedadService.getAllEstadosPropiedad();
    }
}
