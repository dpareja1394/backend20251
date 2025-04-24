package co.edu.usbcali.inmobiliaria.mapper;

import co.edu.usbcali.inmobiliaria.dto.EstadoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.dto.PersonaDTO;
import co.edu.usbcali.inmobiliaria.model.EstadoPropiedad;
import co.edu.usbcali.inmobiliaria.model.Persona;

public class PersonaMapper {

    public static PersonaDTO modelToDTO(Persona persona) {
        return PersonaDTO.builder()
                .nombre(persona.getNombre())
                .apellido(persona.getApellido())
                .telefono(persona.getTelefono())
                .email(persona.getEmail())
                .direccion(persona.getDireccion())
                .ciudad(persona.getCiudad())
                .codigoPostal(persona.getCodigoPostal())
                .build();
    }

}
