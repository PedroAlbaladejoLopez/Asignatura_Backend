package es.mde.et.madoc.panacea_backend;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch.qos.logback.core.net.SyslogOutputStream;
import es.mde.et.madoc.panacea_backend.models.Activacion;
import es.mde.et.madoc.panacea_backend.models.Actividad;
import es.mde.et.madoc.panacea_backend.models.Recurso;
import es.mde.et.madoc.panacea_backend.models.RecursoMaterial;
import es.mde.et.madoc.panacea_backend.models.enums.TipoJornada;
import es.mde.et.madoc.panacea_backend.models.enums.TipoSituacion;
import es.mde.et.madoc.panacea_backend.repositories.RecursoDAO;
import es.mde.et.madoc.panacea_backend.services.ActivacionService;
import es.mde.et.madoc.panacea_backend.services.ActividadService;
import es.mde.et.madoc.panacea_backend.services.RecursoService;

@SpringBootApplication
public class PanaceaBackendApplication {

	private static RecursoService recursoService;
	private static ActividadService actividadService;
	private static ActivacionService activacionService;

	// Constructor para inyección de RecursoService
	public PanaceaBackendApplication(RecursoService recursoService, ActividadService actividadService,
			ActivacionService activacionService) {
		this.recursoService = recursoService;
		this.actividadService = actividadService;
		this.activacionService = activacionService;
	}

	public static void main(String[] args) {

		// 0. Creación de un objeto con new
		// SpringApplication.run(PanaceaBackendApplication.class, args);
		// Recurso recurso = new Recurso("nas", "RING 1", "FUTER", "MING", "RING 1",
		// "Cid Campeador",
		// "Castilla y León", "Burgos", "Burgos", "20000",
		// "Serv. San 1", "Sin_observaciones");
		// System.out.println(recurso);

		// ----------------------------- OPCION 1 - XML
		// -----------------------------------------// (primero crear
		// applicationContext.xml en resources)

		// SpringApplication.run(PanaceaBackendApplication.class, args);
		// ClassPathXmlApplicationContext contexto= new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// Recurso recurso = contexto.getBean("recurso", Recurso.class);
		// System.out.println(recurso);
		// Activacion activacion = contexto.getBean("activacion", Activacion.class);
		// System.out.println(activacion);

		// ----------------------------OPCION 2 - JAVA
		// CONFIG----------------------------------// (primero crear AppConfig)

		// AnnotationConfigApplicationContext contexto = new
		// AnnotationConfigApplicationContext(AppConfig.class);
		// Recurso recurso = contexto.getBean(Recurso.class);
		// System.out.println(recurso);

		// ----------------------------OPCION 3 - ANNOTATION CONFIG
		// -----------------------------//

		ApplicationContext contexto = SpringApplication.run(PanaceaBackendApplication.class, args);

		// Recurso recurso = contexto.getBean(Recurso.class);
		// System.out.println(recurso);

		// Activacion activacion = contexto.getBean(Activacion.class);
		// System.out.println(activacion);
		ejemploGuardadoBBDD();

	}

	public static void ejemploGuardadoBBDD() {

		// Creacion de un Set de Recursos

		// Recurso 1
		Recurso recurso = new Recurso("nas", "RING 1", "FUTER", "MING", "RING 1", "Cid Campeador", "Castilla y León",
				"Burgos", "Burgos", "20000", "Serv. San 1", "Sin_observaciones");
		try {
			recursoService.guardarRecurso(recurso);
			System.out.println("Guardado recurso: " + recurso);
		} catch (Exception e) {
			System.out.println("Error guardando recurso: " + e);
		}
		// Recurso 2
		Recurso recurso2 = new Recurso("nas", "BZAP XVI", "FUTER", "MACAN", "BRICAN XVI", "San Cristobal",
				"Castilla y León", "Burgos", "Burgos", "20000", "Serv. San 3", "Sin_observaciones");
		try {
			recursoService.guardarRecurso(recurso2);
			System.out.println("Guardado recurso: " + recurso2);
		} catch (Exception e) {
			System.out.println("Error guardando recurso: " + e);
		}

		// Meter los 2 Recursos en un Set
		Set<Recurso> recursos = new HashSet<>();
		recursos.add(recurso);
		recursos.add(recurso2);

		// 1. ONETOONE - Creación de una Actividad relacionada con una Activación

		Activacion activacion = new Activacion(recursos, LocalDateTime.now(), LocalDateTime.now(), TipoJornada.COMPLETA,
				TipoSituacion.COMISION_SERVICIO, LocalDate.now(), "Ejemplo observaciones");
		activacionService.guardarActivacion(activacion);
		Actividad actividad = new Actividad("Nombre de actividad", activacion);
		actividadService.guardarActividad(actividad);

		// Prueba guardar otra actividad con la misma Activacion -- ERROR
//		Actividad actividad2 = new Actividad("Nombre de actividad 2", activacion);
//		actividadService.guardarActividad(actividad2);

		// 2. ONETOMANY Creacion de una Actividad con varias Activaciones

//		Activacion activacion = new Activacion(recursos, LocalDateTime.now(), LocalDateTime.now(), TipoJornada.COMPLETA,
//				TipoSituacion.COMISION_SERVICIO, LocalDate.now(), "Ejemplo observaciones");
//		activacionService.guardarActivacion(activacion);
//		
//		Activacion activacion2 = new Activacion(recursos, LocalDateTime.now(), LocalDateTime.now(), TipoJornada.PARCIAL,
//				TipoSituacion.ACTIVIDAD, LocalDate.now(), "Ejemplo observaciones 2");
//		activacionService.guardarActivacion(activacion2);
//		
//		Set<Activacion> activaciones = new HashSet();
//		activaciones.add(activacion);
//		activaciones.add(activacion2);
//		
//		//Convertir activacion en activaciones en Actividad
//		Actividad actividad = new Actividad("Nombre Actividad", activaciones);
//		actividadService.guardarActividad(actividad);

		// 3. MANYTOMANY Creacion de una Activación con 2 recursos (Ejemplo @ManyToMany)

//		Activacion activacion = new Activacion(recursos, LocalDateTime.now(), LocalDateTime.now(), TipoJornada.COMPLETA,
//				TipoSituacion.COMISION_SERVICIO, LocalDate.now(), "Ejemplo observaciones");
//		activacionService.guardarActivacion(activacion);
//
//		Activacion activacion2 = new Activacion(recursos, LocalDateTime.now(), LocalDateTime.now(),
//				TipoJornada.COMPLETA, TipoSituacion.COMISION_SERVICIO, LocalDate.now(), "Ejemplo observaciones");
//		activacionService.guardarActivacion(activacion2);
	}

}
