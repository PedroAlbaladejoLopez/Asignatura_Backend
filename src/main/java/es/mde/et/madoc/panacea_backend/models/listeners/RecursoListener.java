package es.mde.et.madoc.panacea_backend.models.listeners;

import es.mde.et.madoc.panacea_backend.models.Recurso;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostRemove;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreRemove;
import jakarta.persistence.PreUpdate;

public class RecursoListener {

    // 1. Antes de insertar (persist)
    @PrePersist
    public void antesDeGuardar(Recurso recurso) {
        System.out.println("➡️ @PrePersist: Se va a guardar " + recurso.getId());
    }

    // 2. Después de insertar
    @PostPersist
    public void despuesDeGuardar(Recurso recurso) {
        System.out.println("✅ @PostPersist: Guardado " + recurso.getId());
    }

    // 3. Antes de actualizar
    @PreUpdate
    public void antesDeActualizar(Recurso recurso) {
        System.out.println("✏️ @PreUpdate: Se va a actualizar " + recurso.getId());
    }

    // 4. Después de actualizar
    @PostUpdate
    public void despuesDeActualizar(Recurso recurso) {
        System.out.println("🔄 @PostUpdate: Actualizado " + recurso.getId());
    }

    // 5. Antes de borrar
    @PreRemove
    public void antesDeBorrar(Recurso recurso) {
        System.out.println("🗑️ @PreRemove: Se va a borrar " + recurso.getId());
    }

    // 6. Después de borrar
    @PostRemove
    public void despuesDeBorrar(Recurso recurso) {
        System.out.println("❌ @PostRemove: Borrado " + recurso.getId());
    }

    // 7. Después de cargar desde la BD
    @PostLoad
    public void despuesDeCargar(Recurso recurso) {
        System.out.println("📥 @PostLoad: Cargado " + recurso.getId());
    }
}
