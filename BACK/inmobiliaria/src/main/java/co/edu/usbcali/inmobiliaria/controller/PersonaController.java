package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.dto.request.CreatePersonaRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreatePersonaResponse;
import co.edu.usbcali.inmobiliaria.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
@RequiredArgsConstructor
public class PersonaController {
    private final PersonaService personaService;

    @PostMapping
    ResponseEntity<CreatePersonaResponse> guardarPersona(@RequestBody CreatePersonaRequest createPersonaRequest) throws Exception {
        return new ResponseEntity<>(personaService.createPersona(createPersonaRequest), HttpStatus.CREATED);
    }
}
