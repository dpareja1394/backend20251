package co.edu.usbcali.inmobiliaria.repository;

import co.edu.usbcali.inmobiliaria.model.VentaPropiedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaPropiedadRepository extends JpaRepository<VentaPropiedad, Integer> {
}
