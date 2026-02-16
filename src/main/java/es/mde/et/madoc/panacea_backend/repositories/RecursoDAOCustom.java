package es.mde.et.madoc.panacea_backend.repositories;

import java.util.List;

import es.mde.et.madoc.panacea_backend.models.Recurso;

public interface RecursoDAOCustom {
	List<Recurso> buscarPorBasePersonalizado(String base);
}
