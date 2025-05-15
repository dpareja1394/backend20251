package co.edu.usbcali.inmobiliaria.mapper;

import co.edu.usbcali.inmobiliaria.dto.EstadoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.dto.PersonaDTO;
import co.edu.usbcali.inmobiliaria.dto.request.CreatePersonaRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreatePersonaResponse;
import co.edu.usbcali.inmobiliaria.model.EstadoPropiedad;
import co.edu.usbcali.inmobiliaria.model.Persona;

public class PersonaMapper {

    public static CreatePersonaResponse modelToCreatePersonaResponse(Persona persona) {
        return CreatePersonaResponse.builder()
                .idPersona(persona.getIdPersona())
                .nombre(persona.getNombre())
                .apellido(persona.getApellido())
                .telefono(persona.getTelefono())
                .email(persona.getEmail())
                .direccion(persona.getDireccion())
                .ciudad(persona.getCiudad())
                .codigoPostal(persona.getCodigoPostal())
                .build();
    }

    public static Persona createPersonaRequestToModel(CreatePersonaRequest personaRequest) {
        return Persona.builder()
                .nombre(personaRequest.getNombre())
                .apellido(personaRequest.getApellido())
                .telefono(personaRequest.getTelefono())
                .email(personaRequest.getEmail())
                .direccion(personaRequest.getDireccion())
                .ciudad(personaRequest.getCiudad())
                .codigoPostal(personaRequest.getCodigoPostal())
                .build();
    }

}
