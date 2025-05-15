package co.edu.usbcali.inmobiliaria.service;

import co.edu.usbcali.inmobiliaria.dto.request.CreatePersonaRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreatePersonaResponse;

public interface PersonaService {
    CreatePersonaResponse createPersona(CreatePersonaRequest createPersonaRequest) throws Exception;
}
