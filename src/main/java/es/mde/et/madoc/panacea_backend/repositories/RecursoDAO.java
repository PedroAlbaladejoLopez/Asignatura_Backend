package es.mde.et.madoc.panacea_backend.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import es.mde.et.madoc.panacea_backend.models.Recurso;

@RepositoryRestResource(
path = "recursos", 
collectionResourceRel = "recursos", 
itemResourceRel ="recurso")
public interface RecursoDAO extends JpaRepository<Recurso, UUID>, RecursoDAOCustom{
	
}
