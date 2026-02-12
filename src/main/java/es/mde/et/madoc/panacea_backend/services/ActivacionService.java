package es.mde.et.madoc.panacea_backend.services;

import org.springframework.stereotype.Service;

import es.mde.et.madoc.panacea_backend.models.Activacion;
import es.mde.et.madoc.panacea_backend.repositories.ActivacionDAO;

@Service
public class ActivacionService {
	private ActivacionDAO activacionDAO;
	
	public ActivacionService(ActivacionDAO activacionDAO) {
		this.activacionDAO = activacionDAO;
	}

	public Activacion guardarActivacion(Activacion activacion) {
		return activacionDAO.save(activacion);
	}

}
