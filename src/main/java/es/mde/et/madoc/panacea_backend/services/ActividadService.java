package es.mde.et.madoc.panacea_backend.services;

import org.springframework.stereotype.Service;

import es.mde.et.madoc.panacea_backend.models.Actividad;
import es.mde.et.madoc.panacea_backend.repositories.ActividadDAO;
import jakarta.transaction.Transactional;

@Service
public class ActividadService {
	
	private ActividadDAO actividadDAO;
	
	
	public ActividadService(ActividadDAO actividadDAO) {
		this.actividadDAO = actividadDAO;
	}


	@Transactional
	public Actividad guardarActividad(Actividad actividad) {
		return actividadDAO.save(actividad);
	}

}
