package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.dto.request.CreatePersonaRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreatePersonaResponse;
import co.edu.usbcali.inmobiliaria.mapper.PersonaMapper;
import co.edu.usbcali.inmobiliaria.model.Persona;
import co.edu.usbcali.inmobiliaria.repository.PersonaRepository;
import co.edu.usbcali.inmobiliaria.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    /**
     * @param createPersonaRequest 
     * @return CreatePersonaResponse
     * @throws Exception
     */
    @Override
    public CreatePersonaResponse createPersona(CreatePersonaRequest createPersonaRequest) throws Exception {
        // Validaciones lógicas a Persona
        if(createPersonaRequest == null){
            throw new Exception("El DTO de Persona a guardar no puede ser nulo");
        }
        if(createPersonaRequest.getNombre() == null || createPersonaRequest.getNombre().isBlank()){
            throw new Exception("El nombre de la Persona no puede ser nulo o vacío");
        }
        if(createPersonaRequest.getApellido() == null || createPersonaRequest.getApellido().isBlank()){
            throw new Exception("El apellido de la Persona no puede ser nulo o vacío");
        }
        if(createPersonaRequest.getTelefono() == null || createPersonaRequest.getTelefono().isBlank()){
            throw new Exception("El teléfono de la Persona no puede ser nulo o vacío");
        }
        if(createPersonaRequest.getEmail() == null || createPersonaRequest.getEmail().isBlank()){
            throw new Exception("El email de la Persona no puede ser nulo o vacío");
        }
        if(createPersonaRequest.getDireccion() == null || createPersonaRequest.getDireccion().isBlank()){
            throw new Exception("La dirección de la Persona no puede ser nula o vacía");
        }
        if(createPersonaRequest.getCiudad() == null || createPersonaRequest.getCiudad().isBlank()){
            throw new Exception("La ciudad de la Persona no puede ser nula o vacía");
        }
        if(createPersonaRequest.getCodigoPostal() == null || createPersonaRequest.getCodigoPostal().isBlank()){
            throw new Exception("El código postal de la Persona no puede ser nulo o vacía");
        }

        Persona persona = personaRepository.save(
                PersonaMapper.createPersonaRequestToModel(createPersonaRequest)
        );

        return PersonaMapper.modelToCreatePersonaResponse(persona);
    }
}
