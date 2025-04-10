package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.dto.EstadoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.mapper.EstadoPropiedadMapper;
import co.edu.usbcali.inmobiliaria.model.EstadoPropiedad;
import co.edu.usbcali.inmobiliaria.repository.EstadoPropiedadRepository;
import co.edu.usbcali.inmobiliaria.service.EstadoPropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstadoPropiedadServiceImpl implements EstadoPropiedadService {

    private final EstadoPropiedadRepository estadoPropiedadRepository;

    @Override
    public List<EstadoPropiedad> getAllEstadosPropiedad() {
        return estadoPropiedadRepository.findAll();
    }

    @Override
    public EstadoPropiedadDTO getEstadoPropiedadPorId(Integer id) {
        // Debo devolver un EstadoPropiedadDTO

        // 1. Consulto en DB el EstadoPropiedad por ID
        EstadoPropiedad estadoPropiedad =
                estadoPropiedadRepository.getReferenceById(id);

        // 2. Mapear hacia el DTO el resultado que me trae el modelo
        EstadoPropiedadDTO estadoPropiedadDTO =
                EstadoPropiedadMapper.modelToDTO(estadoPropiedad);

        // 3. Retornar el objeto mapeado a DTO
        return estadoPropiedadDTO;
    }
}
