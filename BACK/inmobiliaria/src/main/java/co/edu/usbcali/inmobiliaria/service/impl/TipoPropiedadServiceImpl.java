package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.model.TipoPropiedad;
import co.edu.usbcali.inmobiliaria.repository.TipoPropiedadRepository;
import co.edu.usbcali.inmobiliaria.service.TipoPropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoPropiedadServiceImpl implements TipoPropiedadService{

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


}
