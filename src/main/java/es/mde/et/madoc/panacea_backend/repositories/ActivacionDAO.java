package es.mde.et.madoc.panacea_backend.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import es.mde.et.madoc.panacea_backend.models.Activacion;

public interface ActivacionDAO extends JpaRepository<Activacion, UUID>{

		Activacion save(Activacion activacion);
}
