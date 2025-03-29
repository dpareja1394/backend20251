package co.edu.usbcali.inmobiliaria.repository;

import co.edu.usbcali.inmobiliaria.model.TipoPropiedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPropiedadRepository extends JpaRepository<TipoPropiedad, Integer> {
}
