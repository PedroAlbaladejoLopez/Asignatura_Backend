package es.mde.et.madoc.panacea_backend.models;

import java.util.List;
import java.util.Set;
import java.util.UUID;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Actividad {
	@Id
	@GeneratedValue
	private UUID id;
	private String nombreActividad;
	
	@OneToOne
	@JoinColumn(name="activacion_id") 
	private Activacion activacion;
	
//	@OneToMany
//	@JoinColumn(name="actividad_id") 
//	private Set<Activacion> activaciones;
	
	public Actividad() {
		super();
	}
	
	public Actividad(String nombreActividad, Activacion activacion) {
		super();
		this.nombreActividad = nombreActividad;
		this.activacion = activacion;
	}
	
//	public Actividad(String nombreActividad, Set<Activacion> activaciones) {
//		super();
//		this.nombreActividad = nombreActividad;
//		this.activaciones = activaciones;
//	}

	public String getNombreActividad() {
		return nombreActividad;
	}
	
	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

//	public Set<Activacion> getActivaciones() {
//		return activaciones;
//	}
//
//	public void setActivaciones(Set<Activacion> activaciones) {
//		this.activaciones = activaciones;
//	}

	public Activacion getActivacion() {
		return activacion;
	}

	public void setActivacion(Activacion activacion) {
		this.activacion = activacion;
	}
	

}
