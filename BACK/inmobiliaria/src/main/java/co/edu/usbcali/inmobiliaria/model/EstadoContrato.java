package co.edu.usbcali.inmobiliaria.model;

public class EstadoContrato {
    private Integer idEstadoContrato;
    private String nombre;
    private String descripcion;

    public Integer getIdEstadoContrato() {
        return idEstadoContrato;
    }

    public void setIdEstadoContrato(Integer idEstadoContrato) {
        this.idEstadoContrato = idEstadoContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
