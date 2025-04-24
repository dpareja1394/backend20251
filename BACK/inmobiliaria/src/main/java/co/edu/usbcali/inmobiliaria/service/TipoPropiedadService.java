package co.edu.usbcali.inmobiliaria.service;

import co.edu.usbcali.inmobiliaria.dto.TipoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.model.TipoPropiedad;
import java.util.List;

public interface TipoPropiedadService {
    List<TipoPropiedad> getAllTiposPropiedad();
    TipoPropiedadDTO getTipoPropiedadPorId(Integer id);
    TipoPropiedadDTO saveTipoPropiedad(TipoPropiedadDTO tipoPropiedadDTO) throws Exception;
}
