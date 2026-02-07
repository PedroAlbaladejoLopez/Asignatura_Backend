package es.mde.et.madoc.panacea_backend.models;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.mde.et.madoc.panacea_backend.models.enums.TipoJornada;
import es.mde.et.madoc.panacea_backend.models.enums.TipoSituacion;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

@Entity
public class Activacion {
	
	public Activacion() {
		super();
	}
  
    //@Autowired  //OPCION 1 - Inyección por constructor.
    public Activacion(Set<Recurso> recursos) {
		this.recursos = recursos;
	}
  
    public Activacion(UUID id, Set<Recurso> recursos, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin,
			TipoJornada tipoJornada, TipoSituacion tipoSituacion, LocalDate altaActivacion, String observaciones) {
		super();
		this.id = id;
		this.recursos = recursos;
		this.fechaHoraInicio = fechaHoraInicio;
		this.fechaHoraFin = fechaHoraFin;
		this.tipoJornada = tipoJornada;
		this.tipoSituacion = tipoSituacion;
		this.altaActivacion = altaActivacion;
		this.observaciones = observaciones;
	}

    @Id
    @GeneratedValue
    private UUID id;
  
    @ManyToMany
    @JoinTable(
        name = "activacion_recurso",
        joinColumns = @JoinColumn(name = "activacion_id"),
        inverseJoinColumns = @JoinColumn(name = "recurso_id"))
    private Set<Recurso> recursos = new HashSet<>(); // Excel = TIPO DE RECURSO, NOMBRE RECURSO

    private LocalDateTime fechaHoraInicio; // Excel = FECHA INICIO, HORA INICIO
    private LocalDateTime fechaHoraFin; // Excel = FECHA FIN, HORA FIN

    private TipoJornada tipoJornada; // Excel = JORNADA

    private TipoSituacion tipoSituacion; // Excel = TIPO SITUACION

    private LocalDate altaActivacion; // Excel = ALTA/MODIF.
    private String observaciones; // Excel = OBSERVACIONES
  
  
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Set<Recurso> getRecursos() {
		return recursos;
	}
	//@Autowired   //OPCION 2 - Inyección por setter.
	public void setRecursos(Set<Recurso> recursos) {
		this.recursos = recursos;
	}
	public LocalDateTime getFechaHoraInicio() {
		return fechaHoraInicio;
	}
	public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}
	public LocalDateTime getFechaHoraFin() {
		return fechaHoraFin;
	}
	public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
		this.fechaHoraFin = fechaHoraFin;
	}
	public TipoJornada getTipoJornada() {
		return tipoJornada;
	}
	public void setTipoJornada(TipoJornada tipoJornada) {
		this.tipoJornada = tipoJornada;
	}
	public TipoSituacion getTipoSituacion() {
		return tipoSituacion;
	}
	public void setTipoSituacion(TipoSituacion tipoSituacion) {
		this.tipoSituacion = tipoSituacion;
	}
	public LocalDate getAltaActivacion() {
		return altaActivacion;
	}
	public void setAltaActivacion(LocalDate altaActivacion) {
		this.altaActivacion = altaActivacion;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	@Override
	public String toString() {
		return "Activacion [id=" + id + ", recursos=" + recursos + ", fechaHoraInicio=" + fechaHoraInicio
				+ ", fechaHoraFin=" + fechaHoraFin + ", tipoJornada=" + tipoJornada + ", tipoSituacion=" + tipoSituacion
				+ ", altaActivacion=" + altaActivacion + ", observaciones=" + observaciones + "]";
	}

  
}
