package es.mde.et.madoc.panacea_backend;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch.qos.logback.core.net.SyslogOutputStream;
import es.mde.et.madoc.panacea_backend.models.Activacion;
import es.mde.et.madoc.panacea_backend.models.Recurso;
import es.mde.et.madoc.panacea_backend.models.RecursoMaterial;
import es.mde.et.madoc.panacea_backend.rest.RecursoDAO;
import es.mde.et.madoc.panacea_backend.service.RecursoService;

@SpringBootApplication
public class PanaceaBackendApplication {
	
	private static RecursoService recursoService;
	
	   // Constructor para inyección de RecursoService
    public PanaceaBackendApplication(RecursoService recursoService) {
        this.recursoService = recursoService;
    }

	public static void main(String[] args) {
		
		//0. Creación de un objeto con new
		//SpringApplication.run(PanaceaBackendApplication.class, args);
		//Recurso recurso = new Recurso("nas", "RING 1", "FUTER", "MING", "RING 1", "Cid Campeador",
        //"Castilla y León", "Burgos", "Burgos", "20000",
        //"Serv. San 1", "Sin_observaciones");
		//System.out.println(recurso);
		
		
		
		//----------------------------- OPCION 1 - XML -----------------------------------------//   (primero crear applicationContext.xml en resources)

		//SpringApplication.run(PanaceaBackendApplication.class, args);
		//ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
		//Recurso recurso = contexto.getBean("recurso", Recurso.class);
		//System.out.println(recurso);
		//Activacion activacion = contexto.getBean("activacion", Activacion.class);
		//System.out.println(activacion);
		
		
		//----------------------------OPCION 2 - JAVA CONFIG----------------------------------//     (primero crear AppConfig)
		
		//AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);
		//Recurso recurso = contexto.getBean(Recurso.class);
		//System.out.println(recurso);
		        
		   
		//----------------------------OPCION 3 - ANNOTATION CONFIG -----------------------------//

		ApplicationContext contexto = SpringApplication.run(PanaceaBackendApplication.class, args);

		//Recurso recurso = contexto.getBean(Recurso.class);
		//System.out.println(recurso);

		//Activacion activacion = contexto.getBean(Activacion.class);
		//System.out.println(activacion);
		ejemploGuardadoBBDD();
		
	}
	
	public static void ejemploGuardadoBBDD() {
		Recurso recurso = new Recurso("nas", "RING 1", "FUTER", "MING", "RING 1", "Cid Campeador",
        "Castilla y León", "Burgos", "Burgos", "20000",
        "Serv. San 1", "Sin_observaciones");
		try {
			recursoService.guardarRecurso(recurso);
			System.out.println("Guardado recurso: " + recurso);
		} catch (Exception e) {
			System.out.println("Error guardando recurso: " + e);
		}
	}
	
	

}
