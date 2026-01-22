package es.mde.et.madoc.panacea_backend.models;


public class RecursoMaterial extends Recurso {

  public RecursoMaterial(String nas, String uCO, String m1n, String m2n, String m3n, String base,
			String comunidadAutonoma, String provincia, String localidad, String codigoPostal,
			String servicioMedicoReferencia, String observaciones) {
		super(nas, uCO, m1n, m2n, m3n, base, comunidadAutonoma, provincia, localidad, codigoPostal, servicioMedicoReferencia,
				observaciones);
		// TODO Auto-generated constructor stub
	}

  private String numeroSerie; // Excel = NOMBRE/MATRICULA

  private String tipoMaterial; // Excel = RECURSO

  private String categoria; // Excel = DATOS RECURSO
}

