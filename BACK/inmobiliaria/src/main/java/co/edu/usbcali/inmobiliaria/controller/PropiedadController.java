package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.dto.request.CreatePropiedadRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreatePropiedadResponse;
import co.edu.usbcali.inmobiliaria.service.PropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/propiedad")
@RequiredArgsConstructor
public class PropiedadController {
    private final PropiedadService propiedadService;

    @PostMapping
    ResponseEntity<CreatePropiedadResponse> createPropiedad(CreatePropiedadRequest createPropiedadRequest) throws Exception {
        return new ResponseEntity<>(propiedadService.createPropiedad(createPropiedadRequest), HttpStatus.CREATED);
    }

}
