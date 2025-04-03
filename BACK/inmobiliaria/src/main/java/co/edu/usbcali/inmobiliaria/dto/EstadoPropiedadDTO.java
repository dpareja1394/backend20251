package co.edu.usbcali.inmobiliaria.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EstadoPropiedadDTO {
    @JsonProperty("id_estado_propiedad")
    private Integer idEstadoPropiedad;
    private String nombre;
    private String descripcion;
}
