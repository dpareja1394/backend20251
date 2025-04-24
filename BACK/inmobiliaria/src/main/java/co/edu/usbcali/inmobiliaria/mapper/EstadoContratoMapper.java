package co.edu.usbcali.inmobiliaria.mapper;

import co.edu.usbcali.inmobiliaria.dto.EstadoContratoDTO;
import co.edu.usbcali.inmobiliaria.model.EstadoContrato;

public class EstadoContratoMapper {

    public static EstadoContratoDTO modelToDTO(EstadoContrato estadoContrato) {
        return EstadoContratoDTO.builder()
                .nombre(estadoContrato.getNombre())
                .descripcion(estadoContrato.getDescripcion())
                .build();
    }

    public static EstadoContrato dtoToModel(EstadoContratoDTO estadoContratoDTO) {
        return EstadoContrato.builder()
                .nombre(estadoContratoDTO.getNombre())
                .descripcion(estadoContratoDTO.getDescripcion())
                .build();
    }

}
