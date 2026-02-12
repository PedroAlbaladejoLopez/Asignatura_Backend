package es.mde.et.madoc.panacea_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.mde.et.madoc.panacea_backend.models.Recurso;
import es.mde.et.madoc.panacea_backend.services.RecursoService;

@Repository
public interface RecursoDAO extends JpaRepository<Recurso, String>{

	Recurso save(RecursoService recurso);

}
