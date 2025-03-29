package co.edu.usbcali.inmobiliaria.repository;

import co.edu.usbcali.inmobiliaria.model.EstadoPropiedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoPropiedadRepository extends JpaRepository<EstadoPropiedad, Integer> {
}
