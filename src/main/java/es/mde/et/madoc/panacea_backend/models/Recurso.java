package es.mde.et.madoc.panacea_backend.models;

import java.time.LocalDate;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Recurso {
	
	private static final Logger log =
            LoggerFactory.getLogger(Recurso.class);
    @Id
    @GeneratedValue
    private UUID id;
	
	@Value("${nas.valor:XXX}")
	private String nas; // Excel = ARG NAS
	
	private String UCO; // Excel = UCO
	private String M1N; // Excel = M1N
	private String M2N; // Excel = M2N
	private String M3N; // Excel = M3N
	private String base; // Excel = BAE
	private String comunidadAutonoma; // Excel = COMUNIDAD AUTONOMA
	private String provincia; // Excel = PROVINCIA
	private String localidad; // Excel = LOCALIDAD
	private String codigoPostal; // Excel = COD. POSTAL
	private String servicioMedicoReferencia; // Excel = SRV. MED. REF
	private LocalDate altaRecurso; // Excel = ALTA/MODIF.
	private String observaciones; // Excel = OTROS DATOS RECURSO
	
	@ManyToMany (mappedBy = "recursos")
	private Set<Activacion> activaciones = new HashSet<>();
	
	public Recurso() {
		super();
		//--------------solo para ejemplo de logs--------------//
		try {
			this.UCO = "BRILEG";
			//int numero = Integer.parseInt(UCO);  //Error intencionado
			log.info("Setteado UCO en Recurso");
		} catch (Exception e) {
			log.error("Error seteando UCO en Recurso: ", e);
		}
		//----------------------------------------------------//
	}
	
	public Recurso(String M1N) {
		super();
		this.M1N = M1N;
	}

	public Recurso(String nas, String uCO, String m1n, String m2n, String m3n, String base,
	      String comunidadAutonoma, String provincia, String localidad, String codigoPostal,
	      String servicioMedicoReferencia, String observaciones) {
	    super();
	    this.nas = nas;
	    UCO = uCO;
	    M1N = m1n;
	    M2N = m2n;
	    M3N = m3n;
	    this.base = base;
	    this.comunidadAutonoma = comunidadAutonoma;
	    this.provincia = provincia;
	    this.localidad = localidad;
	    this.codigoPostal = codigoPostal;
	    this.servicioMedicoReferencia = servicioMedicoReferencia;
	    this.observaciones = observaciones;
	    this.altaRecurso = LocalDate.now();
	    this.activaciones = new HashSet<Activacion>();
	  }
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public static Logger getLog() {
		return log;
	}

	public String getNas() {
		return nas;
	}
	
	public void setNas(String nas) {
		this.nas = nas;
	}
	
	
	public String getUCO() {
		return UCO;
	}
	
	
	public void setUCO(String uCO) {
		UCO = uCO;
	}
	
	
	public String getM1N() {
		return M1N;
	}
	
	
	public void setM1N(String m1n) {
		M1N = m1n;
	}
	
	
	public String getM2N() {
		return M2N;
	}
	
	
	public void setM2N(String m2n) {
		M2N = m2n;
	}
	
	
	public String getM3N() {
		return M3N;
	}
	
	
	public void setM3N(String m3n) {
		M3N = m3n;
	}
	
	
	public String getBase() {
		return base;
	}
	
	
	public void setBase(String base) {
		this.base = base;
	}
	
	
	public String getComunidadAutonoma() {
		return comunidadAutonoma;
	}
	
	
	public void setComunidadAutonoma(String comunidadAutonoma) {
		this.comunidadAutonoma = comunidadAutonoma;
	}
	
	
	public String getProvincia() {
		return provincia;
	}
	
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	public String getLocalidad() {
		return localidad;
	}
	
	
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
	public String getCodigoPostal() {
		return codigoPostal;
	}
	
	
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	public String getServicioMedicoReferencia() {
		return servicioMedicoReferencia;
	}
	
	
	public void setServicioMedicoReferencia(String servicioMedicoReferencia) {
		this.servicioMedicoReferencia = servicioMedicoReferencia;
	}
	
	
	public LocalDate getAltaRecurso() {
		return altaRecurso;
	}
	
	
	public void setAltaRecurso(LocalDate altaRecurso) {
		this.altaRecurso = altaRecurso;
	}
	
	
	public String getObservaciones() {
		return observaciones;
	}
	
	
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	public Set<Activacion> getActivaciones() {
		return activaciones;
	}
	
	
	public void setActivaciones(Set<Activacion> activaciones) {
		this.activaciones = activaciones;
	}
	
	
	@Override
	public String toString() {
		return "Recurso [id=" + id + ", nas=" + nas + ", UCO=" + UCO + ", M1N=" + M1N + ", M2N=" + M2N + ", M3N=" + M3N
				+ ", base=" + base + ", comunidadAutonoma=" + comunidadAutonoma + ", provincia=" + provincia
				+ ", localidad=" + localidad + ", codigoPostal=" + codigoPostal + ", servicioMedicoReferencia="
				+ servicioMedicoReferencia + ", altaRecurso=" + altaRecurso + ", observaciones=" + observaciones
				+ ", activaciones=" + activaciones + "]";
	}

}
