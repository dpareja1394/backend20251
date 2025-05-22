package co.edu.usbcali.inmobiliaria.service;

import co.edu.usbcali.inmobiliaria.dto.request.CreatePropiedadRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreatePropiedadResponse;

public interface PropiedadService {
    CreatePropiedadResponse createPropiedad(CreatePropiedadRequest createPropiedadRequest) throws Exception;
}
