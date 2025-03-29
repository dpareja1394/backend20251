package co.edu.usbcali.inmobiliaria.repository;

import co.edu.usbcali.inmobiliaria.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
