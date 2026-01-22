package es.mde.et.madoc.panacea_backend.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import es.mde.et.madoc.panacea_backend.models.Activacion;

public class Recurso {

  private String id;

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

  private LocalDate altaRecurso; // Excel = ALTA/MODIF.
  private String observaciones; // Excel = OTROS DATOS RECURSO

  private Set<Activacion> activaciones = new HashSet<>();


@Override
public String toString() {
	return "Recurso [id=" + id + ", nas=" + nas + ", UCO=" + UCO + ", M1N=" + M1N + ", M2N=" + M2N + ", M3N=" + M3N
			+ ", base=" + base + ", comunidadAutonoma=" + comunidadAutonoma + ", provincia=" + provincia
			+ ", localidad=" + localidad + ", codigoPostal=" + codigoPostal + ", servicioMedicoReferencia="
			+ servicioMedicoReferencia + ", altaRecurso=" + altaRecurso + ", observaciones=" + observaciones
			+ ", activaciones=" + activaciones + "]";
}
  
  
}
