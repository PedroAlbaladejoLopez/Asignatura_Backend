package es.mde.et.madoc.panacea_backend.repositories.impl;

import java.util.List;

import es.mde.et.madoc.panacea_backend.models.Recurso;
import es.mde.et.madoc.panacea_backend.repositories.RecursoDAOCustom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class RecursoDAOCustomImpl implements RecursoDAOCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Recurso> buscarPorBasePersonalizado(String base) {
        String jpql = "SELECT r FROM Recurso r WHERE r.base = :base";
        return entityManager.createQuery(jpql, Recurso.class)
                            .setParameter("base", base)
                            .getResultList();
    }
}
