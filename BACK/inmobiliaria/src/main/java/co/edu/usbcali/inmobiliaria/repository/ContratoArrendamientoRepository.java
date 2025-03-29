package co.edu.usbcali.inmobiliaria.repository;

import co.edu.usbcali.inmobiliaria.model.ContratoArrendamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoArrendamientoRepository extends JpaRepository<ContratoArrendamiento, Integer> {
}
