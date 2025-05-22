package co.edu.usbcali.inmobiliaria.mapper;

import co.edu.usbcali.inmobiliaria.dto.request.CreatePropiedadRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreatePropiedadResponse;
import co.edu.usbcali.inmobiliaria.model.Propiedad;

import java.sql.Timestamp;

public class PropiedadMapper {
    public static Propiedad createPropiedadRequestToModel(CreatePropiedadRequest createPropiedadRequest) {
        return Propiedad.builder()
                .direccion(createPropiedadRequest.getDireccion())
                .ciudad(createPropiedadRequest.getCiudad())
                .codigoPostal(createPropiedadRequest.getCodigoPostal())
                .metrosCuadrados(createPropiedadRequest.getMetrosCuadrados())
                .habitaciones(createPropiedadRequest.getHabitaciones())
                .banos(createPropiedadRequest.getBanos())
                .precio(createPropiedadRequest.getPrecio())
                .fechaCreacion(new Timestamp(System.currentTimeMillis()))
                .build();
    }

    public static CreatePropiedadResponse propiedadToCreateResponse(Propiedad propiedad) {
        return CreatePropiedadResponse.builder()
                .id(propiedad.getIdPropiedad())
                .direccion(propiedad.getDireccion())
                .ciudad(propiedad.getCiudad())
                .codigoPostal(propiedad.getCodigoPostal())
                .metrosCuadrados(propiedad.getMetrosCuadrados())
                .habitaciones(propiedad.getHabitaciones())
                .banos(propiedad.getBanos())
                .precio(propiedad.getPrecio())
                .nombrePropietario(
                        propiedad.getPropietario() == null ?
                                null :
                        propiedad.getPropietario().getNombre()+" "
                                +propiedad.getPropietario().getApellido()
                )
                .nombreAsesor(
                        propiedad.getAsesor() == null ?
                                null :
                                propiedad.getAsesor().getNombre()+" "
                        +propiedad.getAsesor().getApellido()
                )
                .tipoPropiedad(propiedad.getTipoPropiedad() == null ?
                        null : propiedad.getTipoPropiedad().getNombre())
                .estadoPropiedad(propiedad.getEstadoPropiedad() == null ?
                        null : propiedad.getEstadoPropiedad().getNombre())
                .build();
    }
}
