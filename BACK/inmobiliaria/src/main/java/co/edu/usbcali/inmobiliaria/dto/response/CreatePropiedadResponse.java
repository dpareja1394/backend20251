package co.edu.usbcali.inmobiliaria.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreatePropiedadResponse {
    private Integer id;
    private String direccion;
    private String ciudad;

    @JsonProperty("codigo_postal")
    private String codigoPostal;

    @JsonProperty("metros_cuadrados")
    private Integer metrosCuadrados;

    private Integer habitaciones;
    private Integer banos;
    private BigDecimal precio;

    @JsonProperty("propietario")
    private String nombrePropietario;

    @JsonProperty("asesor")
    private String nombreAsesor;

    @JsonProperty("tipo_propiedad")
    private String tipoPropiedad;

    @JsonProperty("estado_propiedad")
    private String estadoPropiedad;
}
