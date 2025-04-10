package co.edu.usbcali.inmobiliaria.mapper;

import co.edu.usbcali.inmobiliaria.dto.TipoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.model.TipoPropiedad;

public class TipoPropiedadMapper {

    public static TipoPropiedadDTO modelToDTO(TipoPropiedad tipoPropiedad){
        return TipoPropiedadDTO.builder()
                .nombre(tipoPropiedad.getNombre())
                .descripcion(tipoPropiedad.getDescripcion())
                .build();
    }

}
