package es.mde.et.madoc.panacea_backend.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.mde.et.madoc.panacea_backend.models.Recurso;
import es.mde.et.madoc.panacea_backend.repositories.RecursoDAO;

@Service
public class RecursoService {

    private final RecursoDAO recursoDAO;

    // Constructor con inyección de DAO
    public RecursoService(RecursoDAO recursoDAO) {
        this.recursoDAO = recursoDAO;
    }

    /**
     * Guarda un recurso en la base de datos
     * @param recurso La entidad Recurso a guardar
     * @return El recurso guardado (con ID generado)
     */
    @Transactional
    public Recurso guardarRecurso(Recurso recurso) {
        return recursoDAO.save(recurso);
    }
}
