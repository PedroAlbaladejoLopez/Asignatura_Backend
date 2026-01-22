package es.mde.et.madoc.panacea_backend.models.enums;

public enum TipoSituacion {
	ACTIVIDAD, // Ambos tipos (humano/material)
	BAJA_MEDICA, // Solo humano
	LIMITACION, // Solo humano
	COMISION_SERVICIO, // Solo humano
	FORMACION_NO_CERTIFICADA, // Solo humano
	NO_OPERATIVO, // Solo material
	OTROS, // Ambos
	PERMISO_LICENCIA // Solo humano
}
