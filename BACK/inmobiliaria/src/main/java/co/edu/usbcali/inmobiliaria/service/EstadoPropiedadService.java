package co.edu.usbcali.inmobiliaria.service;

import co.edu.usbcali.inmobiliaria.model.EstadoPropiedad;
import java.util.List;

public interface EstadoPropiedadService {
    List<EstadoPropiedad> getAllEstadosPropiedad();

    // Otro método para consultar un estado propiedad por su id
    EstadoPropiedad getEstadoPropiedadPorId(Integer id);
}
