package es.mde.et.madoc.panacea_backend.models;

import es.mde.et.madoc.panacea_backend.models.enums.TipoPersonal;

public class RecursoHumano extends Recurso {
	
  public RecursoHumano(String nas, String uCO, String m1n, String m2n, String m3n, String base,
			String comunidadAutonoma, String provincia, String localidad, String codigoPostal,
			String servicioMedicoReferencia, String observaciones) {
		super(nas, uCO, m1n, m2n, m3n, base, comunidadAutonoma, provincia, localidad, codigoPostal, servicioMedicoReferencia,
				observaciones);
		// TODO Auto-generated constructor stub
	}
  private String nombre; // Excel = NOMBRE/MATRICULA

  private TipoPersonal tipoPersonal; // Excel = RECURSO

  private String empleo; // Excel = DATOS RECURSO
  private String telefono; // Excel = TELEFONO
  private String correo; // Excel = EMAIL
}
