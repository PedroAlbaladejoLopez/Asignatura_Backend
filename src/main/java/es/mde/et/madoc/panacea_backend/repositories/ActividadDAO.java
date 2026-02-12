package es.mde.et.madoc.panacea_backend.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import es.mde.et.madoc.panacea_backend.models.Actividad;

public interface ActividadDAO extends JpaRepository<Actividad, UUID>{

}
