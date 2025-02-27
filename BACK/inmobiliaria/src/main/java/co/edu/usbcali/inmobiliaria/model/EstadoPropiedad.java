package co.edu.usbcali.inmobiliaria.model;

public class EstadoPropiedad {
    private Integer idEstadoPropiedad;
    private String nombre;
    private String descripcion;

    public Integer getIdEstadoPropiedad() {
        return idEstadoPropiedad;
    }

    public void setIdEstadoPropiedad(Integer idEstadoPropiedad) {
        this.idEstadoPropiedad = idEstadoPropiedad;
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
