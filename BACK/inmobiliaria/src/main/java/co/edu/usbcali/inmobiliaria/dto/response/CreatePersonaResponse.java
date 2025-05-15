package co.edu.usbcali.inmobiliaria.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreatePersonaResponse {
    @JsonProperty("id_persona")
    private Integer idPersona;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String direccion;
    private String ciudad;
    @JsonProperty("codigo_postal")
    private String codigoPostal;
}
