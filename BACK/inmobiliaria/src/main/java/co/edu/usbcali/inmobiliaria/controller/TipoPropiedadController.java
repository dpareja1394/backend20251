package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.dto.TipoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.model.TipoPropiedad;
import co.edu.usbcali.inmobiliaria.service.TipoPropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipo-propiedad")
@RequiredArgsConstructor
public class TipoPropiedadController {
    // Inyección de dependencias del Servicio en el Controlador
    private final TipoPropiedadService tipoPropiedadService;

    @GetMapping("/todos")
    public List<TipoPropiedad> buscarTodos(){
        return tipoPropiedadService.getAllTiposPropiedad();
    }

    @GetMapping("/buscar-por-id/{id}")
    public ResponseEntity<TipoPropiedadDTO> buscarPorId(@PathVariable Integer id) {
        return new ResponseEntity<>(
                tipoPropiedadService.getTipoPropiedadPorId(id),
                HttpStatus.OK
        );
    }
}
