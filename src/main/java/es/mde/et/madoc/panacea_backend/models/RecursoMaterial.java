package es.mde.et.madoc.panacea_backend.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity 
@DiscriminatorValue("MATERIAL")
public class RecursoMaterial extends Recurso {

	private String numeroSerie; // Excel = NOMBRE/MATRICULA
	private String tipoMaterial; // Excel = RECURSO
	private String categoria; // Excel = DATOS RECURSO

	public RecursoMaterial() {
	}

	public RecursoMaterial(String nas, String uCO, String m1n, String m2n, String m3n, String base,
			String comunidadAutonoma, String provincia, String localidad, String codigoPostal,
			String servicioMedicoReferencia, String observaciones) {
		super(nas, uCO, m1n, m2n, m3n, base, comunidadAutonoma, provincia, localidad, codigoPostal,
				servicioMedicoReferencia, observaciones);

	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
