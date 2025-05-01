package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.dto.TipoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.dto.request.CreateTipoPropiedadRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreateTipoPropiedadResponse;
import co.edu.usbcali.inmobiliaria.mapper.TipoPropiedadMapper;
import co.edu.usbcali.inmobiliaria.model.TipoPropiedad;
import co.edu.usbcali.inmobiliaria.repository.TipoPropiedadRepository;
import co.edu.usbcali.inmobiliaria.service.TipoPropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoPropiedadServiceImpl implements TipoPropiedadService {

    private final TipoPropiedadRepository tipoPropiedadRepository;

    @Override
    public List<TipoPropiedad> getAllTiposPropiedad() {
        // Aquí vamos a hacer la implementación de este

        // Declaro e inicializo una lista de Tipos de Propiedades
        // En la inicialización, utilizo el método findAll del Repository
        // Para ir a la base de datos y traer todos los tipos de propiedad :D
        List<TipoPropiedad> tiposPropiedad = tipoPropiedadRepository.findAll();

        // Retorno los tipos de propiedad consultados en la línea anterior
        return tiposPropiedad;
    }

    @Override
    public TipoPropiedadDTO getTipoPropiedadPorId(Integer id) {
        return TipoPropiedadMapper.modelToDTO(
                tipoPropiedadRepository.getReferenceById(id)
        );
    }

    @Override
    public CreateTipoPropiedadResponse createTipoPropiedad(CreateTipoPropiedadRequest createTipoPropiedadRequest) throws Exception {
        // Poner validaciones lógicas respecto al DTO del Tipo de Propiedad

        // Validar que el tipo de propiedad no sea nulo
        if (createTipoPropiedadRequest == null) {
            throw new Exception("El tipo de propiedad a guardar no puede ser nulo");
        }

        // Validar que el nombre no sea nulo
        if (createTipoPropiedadRequest.getNombre() == null ||
                createTipoPropiedadRequest.getNombre().isBlank() == true) {
            throw new Exception("El nombre del tipo de propiedad no puede ser nulo o vacío");
        }

        // Validar que la descripción del tipo de propiedad a agregar no sea nula ni vacía
        if (createTipoPropiedadRequest.getDescripcion() == null
        || createTipoPropiedadRequest.getDescripcion().isBlank() == true) {
            throw new Exception("La descripción del tipo de propiedad no puede ser nula o vacía");
        }

        // Convertir de Request a Model
        TipoPropiedad tipoPropiedad = TipoPropiedadMapper.createRequestToModel(createTipoPropiedadRequest);

        // Persistir el modelo en base de datos
        tipoPropiedad = tipoPropiedadRepository.save(tipoPropiedad);

        // Convertir a Response para retornar
        CreateTipoPropiedadResponse createTipoPropiedadResponse = TipoPropiedadMapper.modelToCreateResponse(tipoPropiedad);

        // Retornar el Response persistido como lo solicita el métdodo
        return createTipoPropiedadResponse;
    }


}
