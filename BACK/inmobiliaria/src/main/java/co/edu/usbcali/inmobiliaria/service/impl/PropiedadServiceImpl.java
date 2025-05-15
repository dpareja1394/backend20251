package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.dto.request.CreatePropiedadRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreatePropiedadResponse;
import co.edu.usbcali.inmobiliaria.repository.PropiedadRepository;
import co.edu.usbcali.inmobiliaria.service.PropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PropiedadServiceImpl implements PropiedadService {

    private final PropiedadRepository propiedadRepository;


    @Override
    public CreatePropiedadResponse createPropiedad(CreatePropiedadRequest createPropiedadRequest) throws Exception {
        return null;
    }
}
