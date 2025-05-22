package co.edu.usbcali.inmobiliaria.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreatePropiedadRequest {
    private String direccion;
    private String ciudad;

    @JsonProperty("codigo_postal")
    private String codigoPostal;

    @JsonProperty("metros_cuadrados")
    private Integer metrosCuadrados;

    private Integer habitaciones;
    private Integer banos;
    private BigDecimal precio;

    @JsonProperty("id_propietario")
    private Integer idPropietario;

    @JsonProperty("id_asesor")
    private Integer idAsesor;

    @JsonProperty("id_tipo_propiedad")
    private Integer idTipoPropiedad;

    @JsonProperty("id_estado_propiedad")
    private Integer idEstadoPropiedad;
}
