package cib.edu.examen.repository;

import cib.edu.examen.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository  extends JpaRepository<Rol, Integer> {

    Rol findByNomrol(String nombrerol);
}
