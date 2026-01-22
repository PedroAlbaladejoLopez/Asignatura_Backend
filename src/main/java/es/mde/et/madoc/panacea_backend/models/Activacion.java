package es.mde.et.madoc.panacea_backend.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import es.mde.et.madoc.panacea_backend.models.enums.TipoJornada;
import es.mde.et.madoc.panacea_backend.models.enums.TipoSituacion;

public class Activacion {

  private String id;

  private Set<Recurso> recursos = new HashSet<>(); // Excel = TIPO DE RECURSO, NOMBRE RECURSO

  private LocalDateTime fechaHoraInicio; // Excel = FECHA INICIO, HORA INICIO
  private LocalDateTime fechaHoraFin; // Excel = FECHA FIN, HORA FIN

  private TipoJornada tipoJornada; // Excel = JORNADA

  private TipoSituacion tipoSituacion; // Excel = TIPO SITUACION

  private LocalDate altaActivacion; // Excel = ALTA/MODIF.
  private String observaciones; // Excel = OBSERVACIONES
}
