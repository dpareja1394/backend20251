package co.edu.usbcali.inmobiliaria.model;

import jakarta.persistence.*;
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
@Entity
@Table(name = "contratos_arrendamiento")
public class ContratoArrendamiento {
    /*
     * Autor: Daniel Pareja Londoño
     * 15 de marzo 2025
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contrato_arrendamiento")
    private Integer idContratoArrendamiento;

    @Column(name = "fecha_inicio")
    private Timestamp fechaInicio;

    @Column(name = "fecha_fin")
    private Timestamp fechaFin;

    @Column(name = "renta_mensual", precision = 10, scale = 2)
    private BigDecimal rentaMensual;

    @Column(precision = 10, scale = 2)
    private BigDecimal deposito;

    //Llaves foráneas
    @ManyToOne
    @JoinColumn(name = "id_estado_contrato", referencedColumnName = "id_estado_contrato", nullable = false)
    private EstadoContrato estadoContrato;

    @ManyToOne
    @JoinColumn(name = "id_propiedad", referencedColumnName = "id_propiedad", nullable = false)
    private Propiedad propiedad;

    @ManyToOne
    @JoinColumn(name = "id_arrendatario", referencedColumnName = "id_persona", nullable = false)
    private Persona arrendatario;

    @ManyToOne
    @JoinColumn(name = "id_asesor", referencedColumnName = "id_persona", nullable = false)
    private Persona asesor;

}
