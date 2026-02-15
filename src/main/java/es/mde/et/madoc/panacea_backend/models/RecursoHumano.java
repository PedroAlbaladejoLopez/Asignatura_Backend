package es.mde.et.madoc.panacea_backend.models;

import es.mde.et.madoc.panacea_backend.models.enums.TipoPersonal;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("HUMANO")
public class RecursoHumano extends Recurso {

	private String nombre; // Excel = NOMBRE/MATRICULA
	private TipoPersonal tipoPersonal; // Excel = RECURSO
	private String empleo; // Excel = DATOS RECURSO
	private String telefono; // Excel = TELEFONO
	private String correo; // Excel = EMAIL

	public RecursoHumano() {
	}

	public RecursoHumano(String nas, String uCO, String m1n, String m2n, String m3n, String base,
			String comunidadAutonoma, String provincia, String localidad, String codigoPostal,
			String servicioMedicoReferencia, String observaciones) {
		super(nas, uCO, m1n, m2n, m3n, base, comunidadAutonoma, provincia, localidad, codigoPostal,
				servicioMedicoReferencia, observaciones);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoPersonal getTipoPersonal() {
		return tipoPersonal;
	}

	public void setTipoPersonal(TipoPersonal tipoPersonal) {
		this.tipoPersonal = tipoPersonal;
	}

	public String getEmpleo() {
		return empleo;
	}

	public void setEmpleo(String empleo) {
		this.empleo = empleo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
