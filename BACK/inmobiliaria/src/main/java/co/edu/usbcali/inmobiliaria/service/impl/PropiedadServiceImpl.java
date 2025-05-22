package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.dto.request.CreatePropiedadRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreatePropiedadResponse;
import co.edu.usbcali.inmobiliaria.mapper.PropiedadMapper;
import co.edu.usbcali.inmobiliaria.model.EstadoPropiedad;
import co.edu.usbcali.inmobiliaria.model.Persona;
import co.edu.usbcali.inmobiliaria.model.Propiedad;
import co.edu.usbcali.inmobiliaria.model.TipoPropiedad;
import co.edu.usbcali.inmobiliaria.repository.EstadoPropiedadRepository;
import co.edu.usbcali.inmobiliaria.repository.PersonaRepository;
import co.edu.usbcali.inmobiliaria.repository.PropiedadRepository;
import co.edu.usbcali.inmobiliaria.repository.TipoPropiedadRepository;
import co.edu.usbcali.inmobiliaria.service.PropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PropiedadServiceImpl implements PropiedadService {

    private final PropiedadRepository propiedadRepository;
    private final TipoPropiedadRepository tipoPropiedadRepository;
    private final PersonaRepository personaRepository;
    private final EstadoPropiedadRepository estadoPropiedadRepository;

    @Override
    public CreatePropiedadResponse createPropiedad(CreatePropiedadRequest createPropiedadRequest) throws Exception {
        // Aquí van las validaciones lógicas respecto al DTO de Propiedad

        // No las haré porque ustedes son los mejores y las saben hacer
        // Nadie lo hace como Frisby lo hace

        // Buscar el Tipo de Propiedad en la base de datos
        TipoPropiedad tipoPropiedad =
                tipoPropiedadRepository.getReferenceById(createPropiedadRequest.getIdTipoPropiedad());
        // Si el tipo de propiedad no existe, lanzar una excepción
        if(tipoPropiedad == null ) {
            throw new Exception("El tipo de propiedad no existe");
        }

        // Buscar el Propietario (Persona) en la base de datos
        Persona propietario =
                personaRepository.getReferenceById(createPropiedadRequest.getIdPropietario());
        if(propietario == null ) {
            throw new Exception("El propietario no existe");
        }

        Persona asesor =
                personaRepository.getReferenceById(createPropiedadRequest.getIdAsesor());
        if (asesor == null) {
            throw new Exception("El asesor no existe");
        }

        // Buscar el Estado de la Propiedad en la base de datos
        EstadoPropiedad estadoPropiedad =
                estadoPropiedadRepository.getReferenceById(createPropiedadRequest.getIdEstadoPropiedad());
        if(estadoPropiedad == null ) {
            throw new Exception("El estado de la propiedad no existe");
        }

        // Mapear hacia Propiedad desde el CreateRequest
        Propiedad propiedad = PropiedadMapper.createPropiedadRequestToModel(createPropiedadRequest);
        // Poner los atributos faltantes de las relaciones
        propiedad.setTipoPropiedad(tipoPropiedad);
        propiedad.setPropietario(propietario);
        propiedad.setAsesor(asesor);
        propiedad.setEstadoPropiedad(estadoPropiedad);

        propiedad = propiedadRepository.save(propiedad);
        CreatePropiedadResponse response =
                PropiedadMapper.propiedadToCreateResponse(propiedad);

        return response;
    }
}
